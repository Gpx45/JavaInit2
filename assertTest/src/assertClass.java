/**
 * Created by Victor on 5/9/2017.
 */

import java.util.Scanner;

public class assertClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter a number: ");
        int number = input.nextInt();

        // typically assert is disabled so you must explicitly
        // use it either in debugging or in command line.
        assert(number <= 0 && number >= 10);
        System.out.printf("You've entered %d\n", number);

    }
}