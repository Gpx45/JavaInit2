/**
 * Created by Victor on 5/15/2017.
 */
public class ATM
{
    private boolean userAuthenticated;  //whether user is authenticated.
    private int currentAccountNumber;   //current user's account number
    private Screen screen;  // ATM's screen
    private Keypad keypad;  // ATM's keypad
    private CashDispenser cashDispenser;   // ATM's cash dispenser
    private DepositSlot depositSlot;    // ATM's deposit slot
    private BankDatabase bankDatabase;  // account information database

    // constants corresponding to main menu options
    private static final int BALANCE_INQUIRY = 1;
    private static final int WITHDRAWAL = 2;
    private static final int DEPOSIT = 3;
    private static final int EXIT = 4;

    //no-argument ATM constructor initializes instance variables
    public ATM()
    {
        userAuthenticated = false;  //user is not authenticated to start
        currentAccountNumber = 0;   //no current account number to start
        screen = new Screen();  // create screen
        keypad = new Keypad();  // create keypad
        cashDispenser = new CashDispenser();    // create cash dispenser
        depositSlot = new DepositSlot();    // create deposit.
        bankDatabase = new BankDatabase();  // create account information database.
    }

    // start ATM
    public void run()
    {
        // welcome and authenticate user; perform transactions
        while(true)
        {
            // loop while user is not yet authenticated.
            while (!userAuthenticated)
            {
                screen.displayMessageLine("\nWelcome");
                authenticateUser(); // authenticated user.
            }

            performTransactions();  // user is now authenticated
            userAuthenticated = false;  // reset before next ATM session
            currentAccountNumber = 0;   // reset before next ATM session
            screen.displayMessageLine("\nThank you Goodbye");
        }
    }

    // attempts to authenticate user against database
    private void authenticateUser()
    {
        screen.displayMessage("Please Enter your account number: ");
        int accountNumber = keypad.getInput();  // input account number
        screen.displayMessage("\n Enter your PIN: ");   // prompt for PIN
        int pin = keypad.getInput();    // input PIN

        // set userAuthenticated to boolean value returned by database
        userAuthenticated =
                bankDatabase.authenticatedUser(accountNumber, pin);

        // check whether authentication succeded
        if (userAuthenticated)
        {
            currentAccountNumber = accountNumber;   // save user's account#
        }
        else
            screen.displayMessageLine(
                    "Invalid account number or PIN. Please try again.");
    }

    // display the main menu and perform transactions
    private void performTransactions()
    {
        // local variable to store transaction currently being processed
        Transaction currentTransaction = null;
        boolean userExited = false; // user has not chosen to exit.

        // loop while user has not chosen option to exit system.
        while (!userExited)
        {
            // show main menu and get user selection
            int mainMenuSelection = displayMainMenu();

            // decide how to proceed based on user's menu selection
            switch (mainMenuSelection)
            {
                // user chose to perform one of three transaction types.
                case BALANCE_INQUIRY:
                case WITHDRAWAL:
                case DEPOSIT:

                    // initialize as new object of chosen type.
                    currentTransaction =
                            createTransaction(mainMenuSelection);

                    currentTransaction.execute();   // execute transaction.
                    break;
                case EXIT:  // user chose ti terminate session
                    screen.displayMessageLine("\nExiting the system.");
                    userExited = true;
                    break;
                default: // user did not enter an integer from 1-4
                    screen.displayMessageLine(
                            "\nYou did not enter a valid selection. Try again.");
                break;
            }
        }
    }

    //  display the main and return an input selection
    private int displayMainMenu()
    {
        screen.displayMessageLine("\nMain Menu:");
        screen.displayMessageLine("1 - View my balance:");
        screen.displayMessageLine("2 - Withdraw cash:");
        screen.displayMessageLine("3 - Deposit funds:");
        screen.displayMessageLine("4 - Exit\n");
        screen.displayMessage("\nEnter a choice: ");
        return keypad.getInput();
    }

    // return object of specified Transaction subclass
    private Transaction createTransaction(int type)
    {
        Transaction temp = null;    // temporary Transaction variable

        //determine which type of Transaction to create
        switch (type)
        {
            case BALANCE_INQUIRY:
                temp = new BalanceInquiry(
                        currentAccountNumber, screen, bankDatabase);
                break;
            case WITHDRAWAL:
                temp = new Withdrawal(currentAccountNumber, screen,
                        bankDatabase, keypad, cashDispenser);
                break;
            case DEPOSIT:
                temp = new Deposit(currentAccountNumber, screen,
                        bankDatabase, keypad, depositSlot);
                break;
        }
        return temp;    // return the newly created object
    }
}
