import java.util.Scanner;
import java.lang.Math;


public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//            System.out.print("Enter an integer from 1 to 10: ");
//            int numIn = scanner.nextInt();
//            rangeFor(numIn);

        System.out.println("Enter the number of sides for a pair of dice: ");
        long sides = scanner.nextInt();
        diceRoll(sides);


//        System.out.println(sayHello("hi"));
//        String changeMe = "hello codeup!";
//
//        changeString(changeMe);
//
//        System.out.println(changeMe);

        //        System.out.println(addition(5, 5));
        //        System.out.println(subtraction(15,5));
        //        System.out.println(multiplication(5,2));
        //        System.out.println(division(20,2));
        //        System.out.println(modulus(21,11));

//        System.out.println(multiplicationBonus(5,2));
//        System.out.println(multiplicationBonus2(5,5));
//        System.out.println(range(1));

    }

//    public static String  sayHello(String name) {
//        return sayHello(name, "Hello");
//    }
//
//    public static String sayHello(String name, String greeting) {
//        return String.format("%s, %s!!!", greeting, name);
//    }
//
//    public static void changeString(String s) {
//        s = "Wub a lub a dub dub";
//    }

    // static belongs to a class, not to an instance of the class

    //Basic Arithmetic
    //
    //Create four separate methods. Each will perform an arithmetic operation:
    //
    //Addition
//    public static long addition(int num1, int num2) {
//        long result = num1 + num2;
//        return result;
//    }
//
//    //Subtraction
//    public static long subtraction(int num1, int num2) {
//        long result = num1 - num2;
//        return result;
//    }
//
//    //Multiplication
//    public static long multiplication(int num1, int num2) {
//        long result = num1 * num2;
//        return result;
//    }
//
//    //Division
//    public static long division(int num1, int num2) {
//        long result = num1 / num2;
//        return result;
//    }
//
//    //Add a modulus function that finds the modulus of two numbers.
//    public static long modulus(int num1, int num2) {
//        long result = num1 % num2;
//        return result;
//    }

    //Food for thought: What happens if we try to divide by zero? What should happen?
    // Run error

    //Bonus
    //
    //Create your multiplication method without the * operator (Hint: a loop might be helpful).
    //loop
//    public static long multiplicationBonus(int num1, int num2) {
//        long result = 0;
//        for (int i = 1; i <= num2; i++) {
//            result = result+num1;
//        }
//        return result;
//    }

    // recursive
//    public static long multiplicationBonus2(int num1, int num2) {
//        if (num2 == 0) {
//            return 1;
//        } else if (num2 == 1) {
//            return num1;
//        } else if (num2 == 2) {
//            return num1 + num1;
//        }
//        return num1 + multiplicationBonus2(num1, num2 - 1);
//    }

    //Do the above with recursion.
    //Create a method that validates that user input is in a certain range

//    public static String range(int num1) {
//        Scanner scanner = new Scanner(System.in);
//        boolean redo = true;
//        int count = (num1-1);
//
//        if (num1 >= 1 && num1 <= 10) {
//            System.out.print((num1 + " is between 1-10. The factorial of " + num1 + " is: "));
//            do {
//                num1 *= count;
//                --count;
//            } while (count >= 1);
//            System.out.print(num1);
//            return "";
//        } else {
//            System.out.print((num1 + " is not between 1-10. Try again: "));
//            return range(scanner.nextInt());
//        }
//    }

//    public static String range(int num1) {
//        Scanner scanner = new Scanner(System.in);
//        boolean redo = true;
//        int count = 1;
//        int total = 1;
//
//        if (num1 >= 1 && num1 <= 10) {
//            System.out.print((num1 + " is between 1-10. The factorial of " + num1 + " is: "));
//            do {
//                total *= count;
//                count++;
//            } while (count <= num1);
//            System.out.print(total);
//            return "";
//        } else {
//            System.out.print((num1 + " is not between 1-10. Try again: "));
//            return range(scanner.nextInt());
//        }
//    }

//    public static String rangeFor(int num1) {
//        Scanner scanner = new Scanner(System.in);
//        boolean redo = true;
//        int count = 1;
//        long total;
//        do {
//            if (num1 >= 1 && num1 <= 10) {
//                System.out.print((num1 + " is between 1-10. The factorial of " + num1 + " is: "));
//                for (total = 1; count<num1; total*=count) {
//                    count++;
//                }
//                System.out.printf(total + "%nTry again? (y/n) ");
//                String yn = scanner.nextLine();
//                if (yn.equals("y") || yn.equals("yes")) {
//                    redo = true;
//                }
//                else {
//                    redo = false;
//                }
//                return "";
//            } else {
//                System.out.print((num1 + " is not between 1-10. Try again: "));
//                return rangeFor(scanner.nextInt());
//            }
//        } while (redo);
// }


    //Calculate the factorial of a number.
    //Prompt the user to enter an integer from 1 to 10.
    //Display the factorial of the number entered by the user.
    //Ask if the user wants to continue.
    //Use a for loop to calculate the factorial.
    //Assume that the user will enter an integer, but verify it’s between 1 and 10.
    //Use the long type to store the factorial.
    //Continue only if the user agrees to.
    //A factorial is a number multiplied by each of the numbers before it.
    //Factorials are denoted by the exclamation point (n!). Ex:
    //1! = 1               = 1
    //2! = 1 x 2           = 2
    //3! = 1 x 2 x 3       = 6
    //4! = 1 x 2 x 3 x 4   = 24

//    public static void factorial(int num) {
//        Scanner scanner = new Scanner(System.in);
//        boolean redo = true;
//
//        do {
//            System.out.println("Enter an integer from 1 to 10");
//            int userInput = scanner.nextInt();


//
//        } while (redo);
//    }


        //Bonus
        //
        //Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
        //Use Recursion to implement the factorial.

    //Create an application that simulates dice rolling.


    //Ask the user to enter the number of sides for a pair of dice.
    //Prompt the user to roll the dice.
    //"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
    //Use static methods to implement the method(s) that generate the random numbers.
    //Use the .random method of the java.lang.Math class to generate random numbers.



        public static void diceRoll(long numberOfSides) {
            long min = 1;
            long roll1 = (long)(Math.random() * numberOfSides) + min;
            long roll2 = (long)(Math.random() * numberOfSides) + min;
            System.out.printf("You rolled: %d and %d", roll1, roll2);
        }



}

