import java.util.*;
import java.lang.*;

public class PodExercise {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

////        System.out.println("Choose sides for a die roll: ");
//        rollDie();
//
//        System.out.println("Choose sides for dice roll: ");
//        System.out.println(scanner.nextInt());
//
//        System.out.println("Process: ");
        processDice();

    }

    public static int getInteger(int min, int max) {
        int output;
        Scanner sc = new Scanner(System.in);
        while(!sc.hasNextInt()){
            System.out.printf("Invalid input. Enter a valid integer between %d and %d: ", min, max);
            sc.next();
        }
        output = sc.nextInt();
        if(output < min || output > max) {
            System.out.printf("Invalid range. Enter a valid integer between %d and %d: ", min, max);
            return getInteger(min, max);
        }
        return output;
    }

    public static int rollDie(int sides) {
        Random r = new Random();
        return r.nextInt(sides) + 1;
    }

    public static String rollDice(int sides) {
        return String.format("%d and %d", rollDie(sides), rollDie(sides));
    }

    public static void processDice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose a number of sides for the dice");
        int sides = getInteger(1, 50);
        do {
            System.out.println("Rolling dice...");
            System.out.println("You rolled " + rollDice(sides));
            System.out.println("Do you wish to roll again [y/n]?");
        } while(sc.next().equals("y"));
    }
}
