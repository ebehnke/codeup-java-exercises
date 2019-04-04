package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }
    // returns the student's name
    public String getName() {
        return this.name;
    }
    public List<Integer> getGrades() {
        return grades;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
//        for (int i = 0; i<this.grades.size(); i++){
//            total += this.grades.get(i);
//        }
        for (Integer grade : this.grades){
            total += grade;
        }
        return Math.round(total / this.grades.size());
    }

    public static void main(String[] args) {
        Student s1 = new Student("Erik");
        Student s2 = new Student("Jen");
        s1.addGrade(100);
        s1.grades.add(50);
        System.out.println(s1.getGradeAverage());
        s2.grades.add(90);
        s2.grades.add(99);


    }
}
