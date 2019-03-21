//import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class HelloWorld {
    public static void main(String[] args) { //args can be named anything (use it later to refer to it)

//        System.out.print("Hello, ");
//        System.out.println("World!");

        byte myByte = 99; // dont use // -128 to 127
        short myShort = 99; // dont use // -32768 to 32767
        int myInt = 99; // no decimals // -2.1bil to 2.1bil
        long myLong = 99; // no decimals // -9.2pentil to 9.2pentil **just use this for counting**
        float myFloat = 99.98f; // specify with f // 7 digit numbers and decimals
        double myDouble1 = 99.876543210; // decimals // 16 digit numbers **just use this for measuring**
        double myDouble2 = (10d / 3);
        char myChar1 = 'c'; // ' ' needed for chars
        char myChar2 = 'h';
        char myChar3 = 'a';
        char myChar4 = 'r';
        boolean myBoolean = true;

        System.out.println(myByte + myShort + myInt + myLong + myFloat + myDouble1);
        System.out.print("myByte: ");
        System.out.println(myByte);
        System.out.print("myShort: ");
        System.out.println(myShort);
        System.out.print("myInt: ");
        System.out.println(myInt);
        System.out.print("myLong: ");
        System.out.println(myLong);
        System.out.print("myFloat: ");
        System.out.println(myFloat);
        System.out.print("myDouble1: ");
        System.out.println(myDouble1);
        System.out.print("myDouble2: ");
        System.out.println(myDouble2);
        System.out.print("myChar: ");
        System.out.println("" + myChar1 + myChar2 + myChar3 + myChar4);
        System.out.print("myBoolean: ");
        System.out.println(myBoolean);

        System.out.print("myByte == myInt && myShort == myLong: ");
        System.out.println(myByte == myInt && myShort == myLong);

        String myChars = ("" + myChar1 + myChar2 + myChar3 + myChar4);
        System.out.print("myChars: ");
        System.out.println(myChars);



        // 1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out tothe console.

//        int myFavoriteNumber = 21;
//        System.out.println(myFavoriteNumber);

        // 2. Create a String variable named myString and assign a string value to it, then print the variable out tothe console.

        String myString = "myString";
        System.out.println(myString);

        // 3. Change your code to assign a character value to myString. What do you notice?

        myString = "a"; // 'a' does not work
        System.out.println(myString); // now equals a

        // 4. Change your code to assign the value 3.14159 to myString. What happens?

        myString = "3.14159";
        System.out.println(myString);

        // 5. Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumberto the console. What happens?

//        long myNumber = 123;

//        System.out.println(myNumber); // does not work without a value assigned

        // 6. Change your code to assign the value 3.14 to myNumber. What do you notice?

            // It is not allowed

        // 7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

            // It is allowed

        // 8. Change your code to assign the value 123 to myNumber.

            // Allowed

        //    Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning anintegervalue does?

            // decimals are not allowed for long -- needs float or double

        // 9. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? Whatare two ways we could fix this?

//        double myNumber = 3.14;

        // 10. Copy and paste the following code blocks one at a time and execute them

//          int x = 5;
//          System.out.println(x++);
//          System.out.println(x);

//          int x = 5;
//          System.out.println(++x);
//          System.out.println(x);

        // What is the difference between the above code blocks? Explain why the code outputs what it does.

            // x++ prints x before adding
            // ++x adds x and then prints

        // 11. Try to create a variable named class. What happens?

//        String class = "class"; // not allowed

        // 12. Object is the most generic type in Java. You can assign any value to a variable of type Object. Whatdo you think will happen when the following code is run?

//         System.out.println("int three = ");
//         String theNumberThree = "three";
//         Object o = theNumberThree;
//         int three = (int) o;
//

        // Copy and paste the code above and then run it. Does the result match with your expectation?

        // How is the above example different from this code block?

//         int three = (int) "three";
//         System.out.println(three);

        // What are the two different types of errors we are observing?

        // 13. Rewrite the following expressions using the relevant shorthand assignment operators:

//        int x = 4;
//        System.out.println(x);
////        x = x + 5;
//        x += 5;
//        System.out.println(x);


//         int x = 3;
//         int y = 4;
////         y = y * x;
//        y *= 3;
//        System.out.println(y);


//         int x = 10;
//         int y = 2;
////       x = x / y;
////       y = y - x;
//         x /= y;
//         y -= x;
//        System.out.println(x);
//        System.out.println(y);

        // 14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type canhold? What happens if you increment a numeric variable past the type's capacity?

            // the value goes from the highest positive to the most negative value

        // Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximumvalue for the int type.

        System.out.println(Integer.MAX_VALUE);
    }
}

