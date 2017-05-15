/**
 * Created by Victor on 5/13/2017.
 */
public class Withdrawal
{
    // attributes
    private int accountNumber;
    private double amount;

    // references to associated objects
    private Screen screen;  //ATM's Screen
    private Keypad keypad;  //ATM's Keypad
    private CashDispenser cashDispenser;    // ATM's cash dispenser
    private BankDatabase bankDatabase;  // account info database.

    // no argument constructor
    public Withdrawal()
    {
    }

    public void execute()
    {
        
    }

}
