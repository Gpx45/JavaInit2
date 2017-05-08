import java.util.Scanner;
import java.util.InputMismatchException;


public class DividedByZeroExceptionHandling
{
    public static int quotient(int numerator, int denominator)
            throws ArithmeticException
            // throws declares an exception, its used in the method signature.
    {

        return (numerator / denominator);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        do{
            try{
                System.out.print("Please enter an numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Please enter an denominator: ");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("\nResult: %d / %d = %d\n",
                        numerator, denominator, result);

                continueLoop = false;

            }
            catch(InputMismatchException inputMistMatchException)
            {
                System.err.printf("\nException: %s\n",
                        inputMistMatchException);
                scanner.nextLine();
                System.out.println(
                        "You must enter integers. Please try again.\n");
            }
            catch (ArithmeticException arithmeticException)
            {
                System.err.printf("\nException: %s\n:",arithmeticException);
                System.out.println("Zero is an invalid denominator. Please try again.\n");
            }
        } while(continueLoop);
    }
}
