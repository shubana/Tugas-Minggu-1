package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a; /* untuk variabel scan*/
        Scanner nom = new Scanner(System.in);/* untuk scan angka yang diminta*/
        System.out.println(" Enter An integer for Seconds :  "); /* Menampilkan berapa yang mau diisikan*/
        a = nom.nextInt(); /* untuk mendeskripsikan scan*/
        System.out.println(a + " Seconds is "+ a/60 + " Minutes and " +
                a % 60 + " seconds" );
    }

}

