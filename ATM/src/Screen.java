/**
 * Created by Victor on 5/25/2017.
 */
public class Screen
{

    public void displayMessage(String message)
    {
        System.out.print(message);
    }

    public void displayDollarAmount(double amount)
    {
        System.out.printf("$%,.2f", amount);
    }

}
