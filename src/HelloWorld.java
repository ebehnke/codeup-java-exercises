public class HelloWorld {
    public static void main(String[] args) { //args can be named anything (use it later to refer to it)
        System.out.print("Hello, ");
        System.out.println("World!");

        // 1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out tothe console.

        // 2. Create a String variable named myString and assign a string value to it, then print the variable out tothe console.

        // 3. Change your code to assign a character value to myString. What do you notice?

        // 4. Change your code to assign the value 3.14159 to myString. What happens?

        // 5. Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumberto the console. What happens?

        // 6. Change your code to assign the value 3.14 to myNumber. What do you notice?

        // 7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

        // 8. Change your code to assign the value 123 to myNumber.

        //    Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning anintegervalue does?

        // 9. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? Whatare two ways we could fix this?

        // 10. Copy and paste the following code blocks one at a time and execute them

        //  int x = 5;
        //  System.out.println(x++);
        //  System.out.println(x);

        //  int x = 5;
        //  System.out.println(++x);
        //  System.out.println(x);

        // What is the difference between the above code blocks? Explain why the code outputs what it does.

        // 11. Try to create a variable named class. What happens?

        // 12. Object is the most generic type in Java. You can assign any value to a variable of type Object. Whatdo you think will happen when the following code is run?

        // String theNumberThree = "three";
        // Object o = theNumberThree;
        // int three = (int) o;

        // Copy and paste the code above and then run it. Does the result match with your expectation?

        // How is the above example different from this code block?

        // int three = (int) "three";

        // What are the two different types of errors we are observing?

        // 13. Rewrite the following expressions using the relevant shorthand assignment operators:

        // int x = 4;
        // x = x + 5;

        // int x = 3;
        // int y = 4;
        // y = y * x;

        // int x = 10;
        // int y = 2;
        // x = x / y;
        // y = y - x;

        // 14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type canhold? What happens if you increment a numeric variable past the type's capacity?

        // Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximumvalue for the int type.
    }
}

