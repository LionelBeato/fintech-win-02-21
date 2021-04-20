package com.tts;

public class Student extends Person {

    private Integer gradYear;
    private boolean enrolled = false;

    public void enrolledStudent() {
        enrolled = true;
    }

    public Student(String name, int age, String location, Integer gradYear) {
        super(name, age, location);
        this.gradYear = gradYear;
    }

    public Student() {

    }


    @Override
    public String toString() {
        return "Student{" +
                "name=" + super.getName() +
                ", gradYear=" + gradYear +
                ", enrolled=" + enrolled +
                '}';
    }

    // this is a factory methods
    // it will generate object instances for us
    static Student addStudents(String name, int age, int gradYear) {

//        Student newStudent = new Student("Joe", 34, "NC", 2021);
//        return newStudent;

        return new Student(name, age, "NC", gradYear);
    }

}
