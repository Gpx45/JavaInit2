
import java.util.Scanner;

public class DividedByZeroExceptionHandlingTest
{
  public static void main(String[] args)
  {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter an numerator: ");
    int numerator = scanner.nextInt();
    System.out.print("Please enter an denominator: ");
    int denominator = scanner.nextInt();

    int result = DividedByZeroExceptionHandling.quotient(numerator, denominator);
    System.out.printf("\nResult: %d / %d = %d\n", numerator, denominator, result);
  }
}
