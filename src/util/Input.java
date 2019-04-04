package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public static void stringNFE() {
        try {
            String s = "";
            Integer.valueOf(s);
        } catch (NumberFormatException e){
            System.out.println("An integer was not entered.");
        }
    }
    public static void thrower() throws Exception {
        System.out.println("thrower");
    }

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    //The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
    public boolean yesNo() {
        System.out.println("(y/n)?");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt() {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        scanner.next(); // clears input to prevent infinite loop
        stringNFE();
        return getInt();
    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        }
//        scanner.next(); // clears input to prevent infinite loop
        try {
            Integer.valueOf("");
        } catch (NumberFormatException e){
            System.out.println("An integer from " + min + " to " + max + " was not entered.");
        }
        return getInt(min, max);
    }

    public double getDouble() {
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        }
        scanner.next();
        try {
            String s = "";
            Double.valueOf(s);
        } catch (NumberFormatException e){
            System.out.println("A double was not entered.");
        }
        return getDouble();
    }

    public double getDouble(double min, double max) {
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        }
        scanner.next(); // clears input to prevent infinite loop
        return getDouble(min, max);
    }

    public String getBinary(){
        if (scanner.hasNextInt()) {
//            return this
        }
        return "";
    }

    public static void main(String[] args) {
        Input in = new Input();
        Scanner sc = new Scanner(System.in);
        in.getInt();


//        sc.nextInt();


//        System.out.println("Enter double: ");
//        in.getDouble();
//        try {
//            thrower();
//            throw new Exception("asdf");
//        } catch (Exception e) {
//            System.out.println(e);
//        } finally {
//            System.out.println("finally");
//        }
    }
}
