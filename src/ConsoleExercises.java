import java.lang.ref.SoftReference;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        String message = "Greetings";
        String name = "Erik";
        double amount = 20.01;

//        System.out.println(message + " " + name + ". You owe: $" + amount + ".");
//        System.out.format("%s %s. You owe: $%s.\n", message, name, amount);
//        System.out.printf(message + " " + name + ". You owe: $" + amount + ".\n");
//        System.out.printf("%s %s. You owe: $%s.\n", message, name, amount);

        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter something: ");
//        String userInput = scanner.nextLine();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");



        //Copy this code into your main method:

//        double pi = 3.14159;

        //Write some java code that uses the variable pi to output the following:
        //The value of pi is approximately 3.14.
        //Don't change the value of the variable, instead, reference one of the links above and use System.out.format to accomplish this.

//        System.out.printf("The value of pi is approximately %.2f\n", pi);

        //Explore the Scanner Class
        //
        //Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

//        System.out.printf("Enter a number: ");
//        int userNum = scanner.nextInt();
//        System.out.println(userNum);

        //What happens if you input something that is not an integer?
            // run error

        //Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.
//        System.out.print("Enter 3 words: ");
//        String firstWord = scanner.next();
////        System.out.printf("2: ");
//        String secondWord = scanner.next();
////        System.out.printf("3: ");
//        String thirdWord = scanner.next();
//        System.out.printf("The three words were: %s, %s, %s", firstWord, secondWord, thirdWord);

            //What happens if you enter less than 3 words?
                // wont finish run

            //What happens if you enter more than 3 words?
                // does not store extra words

        //Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method, then display that sentence back to the user.

//        System.out.printf("Enter a sentence: ");
//        String userSentence = scanner.next();
//        System.out.printf(userSentence);

            //do you capture all of the words?
                // Not with .next. .nextLine is needed.

            //Rewrite the above example using the .nextLine method.
//            System.out.printf("Enter a sentence: ");
//            String userSentence = scanner.nextLine();
//            System.out.printf(userSentence);

        //Calculate the perimeter and area of Codeup's classrooms

            //Prompt the user to enter values of length and width of a classroom at Codeup.
            System.out.printf("Enter the length: ");
            double lengthInput = new Double(scanner.nextDouble());
            System.out.printf("Enter the width: ");
            double widthInput = scanner.nextDouble();
//            double widthInput = new Double(scanner.nextDouble());
            System.out.printf("The area of the classroom is %.2f.%n", lengthInput * widthInput);
            System.out.printf("The perimeter of the classroom is %.2f.%n", 2*(lengthInput+widthInput));

            //Use the .nextLine method to get user input and cast the resulting string to a numeric type.

            //Assume that the rooms are perfect rectangles.
            //Assume that the user will enter valid numeric data for length and width.
            //Display the area and perimeter of that classroom.

//            double area = lengthInput * widthInput;
//            System.out.printf("Area is: %d\n", area);
//            double perimeter = lengthInput*2+widthInput*2;
//            System.out.printf("Perimeter is: %d\n", perimeter);


        //Bonuses

        //Accept decimal entries


        //Calculate the volume of the rooms in addition to the area and perimeter
//            System.out.printf("Enter the height: ");
//            double heightInput =  scanner.nextDouble();

//            double volume = area*heightInput;
//            System.out.printf("Volume is: %d\n", volume);




        //The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimeter method. Add the following line of code to your application after you have created a scanner (assuming the variable the holds the scanner is named scanner):


        //scanner.useDelimeter("\n");
        //How does this change the way your program operates?

        //Rewrite your classroom calculating program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.
    }
}
