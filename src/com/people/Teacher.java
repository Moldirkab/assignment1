package com.people;

public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private int salary;


    public Teacher(String name, String surname, int age, boolean genderPerson, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age,genderPerson);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public int giveRaise(int percentage) {
            int increaseAmount = (percentage*salary)/100;
            salary += increaseAmount;
        return salary;
    }


    @Override
    public String toString() {
        return super.toString()+ "I teach " + subject +".";
    }
}
