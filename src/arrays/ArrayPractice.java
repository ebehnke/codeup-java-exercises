package arrays;

import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {
         int[] phoneNumber = new int[7];
//        int[] phoneNumber2 = new int[7];
//         boolean[] decisions = new boolean[4];
        // ^ Same as:
         boolean[] decisions = {true, true, false, false};
         String[] answers = new String[4];

         answers[0] = "Yes";
         answers[1] = "True";
         answers[2] = "" + true;
//         System.out.println(answers[answers.length - 1]);

         String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
         String[] daysOfTheWeekend = new String[2];
         daysOfTheWeekend[0] = "Saturday";
         daysOfTheWeekend[1] = "Sunday";
//        System.out.println(daysOfTheWeek[0]);
//         daysOfTheWeek[0] = "Doomsday";
//        System.out.println(daysOfTheWeek[0]);
//        String[] daysOfTheWeekendStringified = daysOfTheWeekend.toString()
//        System.out.println(Arrays.toString(daysOfTheWeekend));


//        for (int i = 0; i < daysOfTheWeek.length; i++){
//            System.out.println(daysOfTheWeek[i]);
//        }
//        // iterate through all in the String array;
//        for (String day : daysOfTheWeek) {
//            System.out.println(day);
//        }
//        // iterate through all in the boolean array:
//        for (boolean decision : decisions) {
//            System.out.println(decision);
//        }

        // iterate through and fill each array with the number 4
//        Arrays.fill(phoneNumber, 4);
//        for (int digit : phoneNumber) {
//            System.out.print(digit);
//        }
//        Arrays.fill(phoneNumber, 4);
//        for (int digit : phoneNumber) {
//            System.out.print(digit);
//        }
//
//        int[] phoneNumber2 = Arrays.copyOf(phoneNumber, 7);
        // Not equal with .equals
//        if (phoneNumber.equals(phoneNumber2)) {
//            System.out.println("They are equal" );
//        } else {
//            System.out.println("They are different");
//        }
        // Using Arrays object they are equal if using copyOf
//        if (Arrays.equals(phoneNumber,phoneNumber2)) {
//            System.out.println("They are equal" );
//        } else {
//            System.out.println("They are different");
//        }

//        System.out.println(Arrays.toString(daysOfTheWeek));
//        Arrays.sort(daysOfTheWeek);
//        System.out.println(Arrays.toString(daysOfTheWeek));
//
//        String[] primaryColors = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
//        System.out.printf("The length of primaryColors array is: %d.%n", primaryColors.length);
//        String[] rainbowColors = Arrays.copyOf(primaryColors, 7);
//        if (Arrays.equals(rainbowColors, primaryColors)) {
//            System.out.printf("They are the same, but their IDs are: %s & %s%n", rainbowColors, primaryColors);
//        }
//
//        System.out.println(Arrays.toString(rainbowColors));
//        Arrays.sort(rainbowColors);
//        System.out.println(Arrays.toString(rainbowColors));
//        Arrays.fill(rainbowColors, "Black");
//        System.out.println(Arrays.toString(rainbowColors));

        // Multidimensional Arrays //
        String[][] java2dArray = new String[3][3];
        java2dArray[2][1] = "String Value";

        char[][] chessBoard = {
                {'R','N','B','Q','K','B','N','R'},
                {'P','P','P','P','P','P','P','P'},
                {'\0','\0','\0','\0','\0','\0','\0','\0'},
                {'\0','\0','\0','\0','\0','\0','\0','\0'},
                {'\0','\0','\0','\0','\0','\0','\0','\0'},
                {'\0','\0','\0','\0','\0','\0','\0','\0'},
                {'p','p','p','p','p','p','p','p'},
                {'r','n','b','k','q','b','n','r'}
        };

        ArrayList<String> colorList = new ArrayList<>();
        colorList.add(0, "Red");
        colorList.add(1, "Orange");
        colorList.add(2, "Yellow");
        colorList.add(3, "Green");
        colorList.add(4, "Blue");
        colorList.add(5, "Indigo");
        colorList.add(6, "Violet");
        colorList.add(7, "Red");

        System.out.println("ArrayList of colors: "          + colorList);
        System.out.println("colorList index 3: "            + colorList.get(3));
        System.out.println("Size of colorList: "            + colorList.size());
        System.out.println("Index of Red: "                 + colorList.indexOf("Red"));
        System.out.println("colorList contains Yellow: "    + colorList.contains("Yellow"));
        System.out.println("colorList lastIndexOf Red: "    + colorList.lastIndexOf("Red") );
        System.out.println("colorList isEmpty: "            + colorList.isEmpty());
        colorList.remove("Red");
        System.out.println(colorList);






    }

}
