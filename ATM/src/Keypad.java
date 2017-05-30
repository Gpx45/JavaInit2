/**
 * Created by Victor on 5/25/2017.
 */
import java.util.Scanner;

public class Keypad
{
    private Scanner input;

    public Keypad()
    {
        input = new Scanner(System.in);
    }

    public int getInput()
    {
        return input.nextInt();
    }
}
