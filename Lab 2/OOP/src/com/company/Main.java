package com.company;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner J = new Scanner(System.in);
        Random ran = new Random();
        DecimalFormat For = new DecimalFormat("00");


        int ran_num1 = ran.nextInt(9 - 0);
        int ran_num2 = ran.nextInt(9 - 0);
        int input, input1, input2;


        System.out.println("Untuk Hasil random: " + ran_num1 + "" + ran_num2);

        System.out.println("Input 2 digit angka Lotre [0-9][0-9]: ");
        input = J.nextInt();
        if (input > 99) {
            System.out.println("kelebihan gan");

        } else {
            String inputFor = For.format(input);

            input1 = Character.getNumericValue(inputFor.charAt(0));
            input2 = Character.getNumericValue(inputFor.charAt(1));

            if (input1 == ran_num1 && input2 == ran_num2) {
                System.out.println("Selamat anda mendapatkan $10.000");

            } else if (input1 == ran_num2 && input2 == ran_num1) {
                System.out.println("Selamat anda mendapatkan $3.000");
            } else if (input1 == ran_num1 || input2 == ran_num2 || input1 == ran_num2 || input2 == ran_num1) {
                System.out.println("Selamat anda mendapatkan $1000");
            } else {
                System.out.println("gacha lagi bang");
            }
        }
    }
}

