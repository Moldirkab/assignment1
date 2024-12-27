package com.people;

import java.util.ArrayList;

public class Student extends Person {
    private static int id_gen=1;
    private int studentID;
    private ArrayList<Integer> grades;


    public Student(String name, String surname, int age, boolean gender){
        super(name,surname,age,gender);
        studentID=id_gen++;
        grades=new ArrayList<>();
}

public int getStudentID(){
        return studentID;
}

public void addGrade(int grade){
    this.grades.add(grade);
}

    public double calculateGpa() {
        int totalGrades=0;
        int totalCredits=0;
        for (Integer  grades: grades) {
            totalGrades+=getGPA(grades);
            totalCredits ++;
        }
        return (double)totalGrades/totalCredits;
    }
    public double getGPA(int grade){
        if (grade >= 95) return 4.0;
        if (grade >= 90) return 3.67;
        if (grade >= 85) return 3.33;
        if (grade >= 80) return 3.0;
        if (grade >= 75) return 2.67;
        if (grade >= 70) return 2.33;
        if (grade >= 65) return 2.0;
        if (grade >= 60) return 1.67;
        if (grade >= 55) return 1.33;
        if (grade >= 50) return 1.0;
        return 0.0;
    }

@Override
public String toString() {
 return super.toString()+" "+ "I am a student with ID "+ studentID+".";
    }
}
