/**
 * Created by Victor on 5/15/2017.
 */
public class ATM
{
    private boolean userAuthenticated;
    private int currentAccountNumber;
    private Screen screen;
    private Keypad keypad;
    private CashDispenser cashDispenser;
    private DepositSlot depositSlot;
    private BankDatabase bankDatabase;

    private static final int BALANCE_INQUIRY = 1;
    private static final int WITHDRAWAL = 2;
    private static final int DEPOSIT = 3;
    private static final int EXIT = 4;

    public ATM()
    {
        userAuthenticated = false;
        currentAccountNumber = 0;
        screen = new Screen();
        keypad = new Keypad();
        cashDispenser = new CashDispenser();
        depositSlot = new DepositSlot();
        bankDatabase = new BankDatabase();
    }

    public void run()
    {
        while(true)
        {

            while (!userAuthenticated)
            {
                screen.displayMessageLine("\nWelcome");
                authenticateUser();
            }

            performTransactions();
            userAuthenticated = false;
            currentAccountNumber = 0;
            screen.displayMessageLine("\nThank you Goodbye");
        }
    }

    private void authenticateUser()
    {
        screen.displayMessage("Please Enter your account number: ");
        int accountNumber = keypad.getInput();
        screen.displayMessage("\n Enter your PIN: ");
        int pin = keypad.getInput();

        userAuthenticated =
                bankDatabase.authenticateUser(accountNumber, pin);

        if (userAuthenticated)
        {
            currentAccountNumber = accountNumber;
        }
        else
            screen.displayMessageLine(
                    "Invalid account number or PIN. Please try again.");
    }


}
