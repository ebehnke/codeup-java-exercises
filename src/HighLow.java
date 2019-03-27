import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long randomNum = (long) (Math.random() * 100) + 1;

        System.out.println("Guess the number from 1-100");
        long guess = scanner.nextLong();
        int count = 1;

        do {
            if (guess < randomNum) {
                System.out.println("Higher.");
                count++;
                System.out.println("Try number " + count + ": ");
                guess = scanner.nextLong();

            } else if (guess > randomNum) {
                System.out.println("Lower.");
                count++;
                System.out.println("Try number " + count + ": ");
                guess = scanner.nextLong();
            }
        } while (guess != randomNum && count < 3);
            if (guess == randomNum) {
                System.out.println("Good job! The number was " + randomNum + ".");
            } else {
                System.out.printf("That was %d tries. The number was %d. Thanks for playing!", count, randomNum);
            }





    }
}
