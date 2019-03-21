import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        boolean hasMoney = true;
//        boolean goodGrades = false;
//        boolean inUSC = true;
//
//        System.out.println((((((((hasMoney)|| inUSC)||hasMoney)|| inUSC)|| hasMoney && inUSC)|| inUSC || hasMoney)|| inUSC)|| goodGrades);


//        System.out.println(inUSC = ());


        //Loop Basics
        //
        //While
        //
        //Create an integer variable i with a value of 5.
        //Create a while loop that runs so long as i is less than or equal to 15
        //Each loop iteration, output the current value of i, then increment i by one.
        //Your output should look like this:
        //
        //5 6 7 8 9 10 11 12 13 14 15
//        int i = 5;
//        while (i<=15) {
//            System.out.print(i + " ");
//            i++;
//        }
//        for (int i = 5; i<=15;i++) {
//            System.out.print(i + " ");
//        }

        //Do While
        //
        //Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        //Alter your loop to count backwards by 5's from 100 to -10.
        //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        //
        // 2
        // 4
        // 16
        // 256
        // 65536
//        long x = 2;
//        do {
//            System.out.println(x);
//            x*=x;
//        } while (x <= 1000000);
//        for (int i = 0; i<100; i+=2){
////            System.out.println(i);
////        }
//        for (int i = 100; i >= -10; i-=5) {
//            System.out.println(i);
//        }
//        for (double i = 2; i<1000000; i*=i) {
//            System.out.println(i);
//        }
        //For
        //
        //refactor the previous two exercises to use a for loop instead



        //Fizzbuzz
        //
        //One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.
        //
        //Write a program that prints the numbers from 1 to 100.
        //For multiples of three print “Fizz” instead of the number
        //For the multiples of five print “Buzz”.
        //For numbers which are multiples of both three and five print “FizzBuzz”.
//        int i = 0;
//        String message = "Fizz";
//        while (i<100) {
//            if (i % 3 == 0) {
//                i++;
//                System.out.println(i + " " + message);
//            } else if (i % 5 == 0) {
//                i++;
//                System.out.println(i + " " + message + "Buzz");
//            } else {
//                i++;
//                System.out.println(i);
//            }
//        }

        //Display a table of powers.
        //
        //Prompt the user to enter an integer.
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter a number: ");
//        double userInt = scanner.nextDouble();
//        System.out.println("You entered: " + userInt);
////        Display a table of squares and cubes from 1 to the value entered.
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for (int i = 1; i <= userInt; i++) {
//            System.out.println(i + "      | " + i*i + "       |" + i*i*i + "   ");
//        }


        //Ask if the user wants to continue.
        //Assume that the user will enter valid data.
        //Only continue if the user agrees to.
        //Example Output
        //
        //
        //What number would you like to go up to? 5
        //
        //Here is your table!
        //
        //number | squared | cubed
        //------ | ------- | -----
        //1      | 1       | 1
        //2      | 4       | 8
        //3      | 9       | 27
        //4      | 16      | 64
        //5      | 25      | 125
        //Convert given number grades into letter grades.
        //
        //Prompt the user for a numerical grade from 0 to 100.
        System.out.print("Would you like to proceed? ");
        String proceed = scanner.next();
        if (proceed.equals("yes")) {
            System.out.print("Enter a grade from 0 - 100: ");
            int gradeInput = scanner.nextInt();
            int lastDigit = gradeInput% 10;

            //Display the corresponding letter grade.
            String gradeOut = "";
            if (gradeInput >= 90 && gradeInput<= 100) {
                gradeOut = "That converts to a letter grade of: A";
            } else if (gradeInput >= 80 && gradeInput <= 89) {
                gradeOut = "That converts to a letter grade of: B";
            } else if (gradeInput >= 70 && gradeInput <= 79) {
                gradeOut = "That converts to a letter grade of: C";
            } else if (gradeInput >= 60 && gradeInput <= 69) {
                gradeOut = "That converts to a letter grade of: D";
            } else {
                gradeOut = "That converts to a letter grade of: F";
            }

            if (lastDigit >= 7 && gradeInput > 60 || gradeInput == 100) {
                gradeOut += "+";
            } else if (lastDigit <= 3 && gradeInput > 60) {
                gradeOut += "-";
            }

            System.out.println(gradeOut);

        } else {
            System.out.println("Bye.");
        }
        //Prompt the user to continue.


        //Assume that the user will enter valid integers for the grades.
        //The application should only continue if the user agrees to.
        //Grade Ranges:
        //
        //A : 100 - 88
        //B : 87 - 80
        //C : 79 - 67
        //D : 66 - 60
        //F : 59 - 0
        //Bonus
        //
        //Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).
        //With some exceptions. Because of how the JVM is implemented, string literals will be re-used, so an expression like "abc" == "abc" will evaluate to true, but only because both sides refer to the same object. This is why it is necessary to use the example with the scanner to demonstrate this concept. Although a shorter demonstration could be done by noting that the expression "abc" == new String("abc") evaluates to false, we feel that this is too complex, given that we have not yet discussed the details of creating objects. See here for more details.
    }
}
