package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

       Scanner J = new Scanner(System.in);
        Random ran = new Random();


        int ran_num1 = ran.nextInt(100);
        int input1;

       // System.out.print("Cheat random angka yang di tebak: " + ran_num1+"\n");

        do {
            System.out.print("Enter Your Guess:  \n");
            input1 = J.nextInt();

            if (input1 > ran_num1) {
                System.out.println("Your guess is too high");
            } else if (input1 < ran_num1) {
                System.out.println("Your guess is too low");
            } else if (input1 == ran_num1) {
                System.out.println("Congrats!!! Yey, the number is " + ran_num1 + "\n\nBy. Joshua sabas");
            }
        }while(input1 != ran_num1);




    }
}
