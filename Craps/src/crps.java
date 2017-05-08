import com.sun.jnlp.JNLPRandomAccessFileNSBImpl;

import java.util.Random;

/**
 * Created by Victor on 1/22/2017.
 */
public class crps {

    private static final Random randomNumbers = new Random();

    private enum Status {CONTINUE, WON, LOST};
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {

        int myPoint = 0;
        Status gameStatus;

        int sumOFDice = rollDice();



    }

    public static int rollDice(){

        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;


        System.out.printf("Player rolled %d + %d = %d\n", die1, die2, sum);
    }


}
