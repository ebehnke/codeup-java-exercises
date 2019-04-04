package grades;

import util.Input;

import java.util.*;

public class GradesApplication {
    static Map<String,Student> students;

    public static void init() {
        students = new HashMap<>();

        Student s1 = new Student("Erik");
        s1.addGrade(100);
        s1.addGrade(100);
        s1.addGrade(50);
        Student s2 = new Student("John");
        s2.addGrade(90);
        s2.addGrade(90);
        s2.addGrade(50);
        Student s3 = new Student("Sally");
        s3.addGrade(80);
        s3.addGrade(80);
        s3.addGrade(50);
        Student s4 = new Student("Jane");
        s4.addGrade(70);
        s4.addGrade(70);
        s4.addGrade(50);
        Student s5 = new Student("Ichiro");
        s5.addGrade(60);
        s5.addGrade(60);
        s5.addGrade(0);

        students.put("ebehnke", s1);
        students.put("jdoe", s2);
        students.put("sfields", s3);
        students.put("jsmith", s4);
        students.put("isuzuki", s5);
    }

    private static void welcome() {
        System.out.printf("Welcome!\n");
        String usernames = "|";
        // loop
        for (String key : students.keySet())
            usernames += " " + key + " |";
        System.out.printf("\n" +
                "Here are the github usernames of our students:\n" +
                "\n" +
                usernames);
        System.out.println();
    }

    private static void outputStudentRecord(String key) {
        // compare studentChoice with usernames
        if (students.containsKey(key)) {
            System.out.printf("Name: %s - Github Username: %s%n", students.get(key).getName(),key);
            System.out.printf("Current Average: %.2f%n%n", students.get(key).getGradeAverage());
            // output student record
        } else {
            System.out.printf("Sorry, no student found with the github username of \"%s\".%n", key);
        }
    }

    public static void main(String[] args) {
        Input input = new Input();
        init();
        welcome();

        boolean keepGoing = true;

        do {
            System.out.println("What student would you like to see more information on?");
            String studentChoice = input.getString();
            System.out.println();

            outputStudentRecord(studentChoice);

            System.out.println("Would you like to see another student?");
            keepGoing = input.yesNo();
            System.out.println();
        } while (keepGoing);

//        System.out.println("students size: " + students.size());
//        System.out.println("Student 1 grades: " + s1.grades);
//        System.out.println(s1.getGradeAverage());
//        System.out.println("ebehnke grades: " + students.get("ebehnke"));
//        System.out.println("students values: " + students.values());

//        System.out.println("Here are the github usernames of our students: " + students.keySet());
//        System.out.println("Which user would you like to see more of?");
//        String githubName = in.getString();

    }

}
