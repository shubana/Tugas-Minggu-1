package com.company;

public class Soal2 {
    public static void main(String[] args) {
        // write your code here
        new Person().printPerson();
        new Student().printPerson();
    }
    static class Student extends Person {
        @Override
        public String getInfo() {
            return "Student";
        }
    }
    static class Person {
        public String getInfo() {
            return "Person";
        }
        public void printPerson() {
            System.out.println(getInfo());
        }
    }
}
