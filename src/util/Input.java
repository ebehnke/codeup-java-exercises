package util;

import java.util.Scanner;

public class Input {

//    private Scanner scanner = new Scanner(System.in);
    private Scanner scanner; // walkthrough

    public Input() { // walkthrough
        this.scanner = new Scanner(System.in);  // walkthrough
    }

    // returns valid string
    public String getString() {
//        return String.format("");
        return scanner.nextLine(); // walkthrough
    }

    //The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
    public boolean yesNo() {
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    //walkthrough
    public int getInt() {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        scanner.next();
        return getInt();
    }

    // walkthrough
    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        }
        scanner.next(); // clears input to prevent infinite loop
        return getInt(min, max);
    }


    //working version
//    public int getInt(int min, int max) {
//        System.out.println("Enter a number between " + min + " and " + max);
//        int userInput = scanner.nextInt();
//
//        while (userInput < min || userInput > max) {
//            System.out.println("Your number is out of range, try again: ");
//            userInput = scanner.nextInt();
//        }
//        System.out.println("Your number " + userInput + " is valid!");
//        return userInput;
//    }

    //The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max.

//    public int getInt(int min, int max) {
//        System.out.printf("Enter a number between the min: %d, and max: %d.%n", min,max);
//        int userInput = scanner.nextInt();
//        do {
//            if (userInput < min) {
//                System.out.println("Too low.");
//            } else if (userInput > max) {
//                System.out.println("Too high");
//            } else {
//                System.out.printf("%d is within range.", userInput);
//            }
//            return userInput;
//        } while (userInput > max || userInput < min);
//    }

//        public int getInt2(int min, int max) {
//            int output;
//            while(!scanner.hasNextInt()){
//                System.out.printf("Invalid input. Enter a valid integer between %d and %d: ", min, max);
//                scanner.next();
//            }
//            System.out.printf("Enter an integer between %d and %d: ", min, max);
//            output = scanner.nextInt();
//            if(output < min || output > max) {
//                System.out.printf("Invalid range. Enter a valid integer between %d and %d: ", min, max);
//                return getInt(min, max);
//            }
//            return output;
//        }

//    public int getInt() {
//        System.out.println("Enter an integer: ");
//        return scanner.nextInt();
//    }

    // The getDouble method should do the same thing, but with decimal numbers.

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between the min: %f, and max: %f.%n", min,max);
        double userInput = scanner.nextDouble();
        if (userInput < min) {
            System.out.println("Too low.");
        } else if (userInput > max) {
            System.out.println("Too high");
        } else {
            System.out.printf("%f is within range.", userInput);
        }
        return userInput;
    }

    public double getDouble() {
        System.out.println("Enter a decimal: ");
        return scanner.nextDouble();
    }

    //Create another class named InputTest that has a static main method that uses all of the methods from the Input class.

    public static void main(String[] args) {
        Input in = new Input();

//        System.out.println(in.getString()); // test to return valid string
////        System.out.println("Yes/no?");
////        System.out.println(in.yesNo()); // test to return boolean yes/no

        System.out.println(in.getInt(1,5));


    }
}
