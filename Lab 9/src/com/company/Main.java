package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new A();
        new B();
    }
    static class A {
        int i = 7;

        public A() {
            setI(20);
            System.out.println("i from A is " + i);
        }

        public void setI(int i) {
            this.i = 2 * i;
        }
    }

    static class B extends A {
        public B() {
            System.out.println("i from B is " + i);
        }

        public void setI(int i) {
            this.i = 3 * i;
        }

    }
}
