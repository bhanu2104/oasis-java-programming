import java.util.*;

public class NumberGussingGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            int number = 1 + (int) (100 * Math.random());
            System.out.println("Number of trails: ");
            int K = s.nextInt();
            int i, guess;
            System.out.println("A number is chosen between 1 to 100,Guess the number within " + K + " trails");
            for (i = 0; i < K; i++) {
                System.out.println("Guess the number:");
                guess = s.nextInt();
                if (number == guess) {
                    System.out.println("Congratulations!.....You won the game.");
                    break;
                } else if (number > guess && i != K - 1) {
                    System.out.println("The number is greater than " + guess);
                } else if (number < guess && i != K - 1) {
                    System.out.println("The number is less than " + guess);
                }
            }

            if (i == K) {
                System.out.println("You have exhausted" + K + " trials.");
                System.out.println("The number was " + number);
            }
        } finally {
            s.close();
        }
    }
}