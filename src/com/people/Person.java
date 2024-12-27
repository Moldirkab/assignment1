package com.people;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean genderBool;


    public Person(String name, String surname, int age, boolean genderBool ) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.genderBool = genderBool;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname( String surname ) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge( int age ) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGenderBool( boolean genderBool ) {
        this.genderBool = genderBool;
    }

    public boolean getGenderBool() {
        return genderBool;
    }


@Override
public String toString() {
        return "Hi, I am "+name+" "+surname+" a " +age+ "-year-old " +(genderBool? "male": "female")+".";
    }
}
