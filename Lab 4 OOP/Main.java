package com.company;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner kata = new Scanner(System.in);


        System.out.print("Masukkan Nama Kota Pertama : ");
        String kota1 = kata.nextLine();
        System.out.print("\nMasukkan Nama Kota Kedua : ");
        String kota2 = kata.nextLine();


        System.out.println("nama kota setelah di urutkan : ");
        if(kota1.compareTo(kota2) > 0){
            System.out.println(kota2 + ", " + kota1);
        }
        else if(kota1.compareTo(kota2) < 0){
            System.out.println(kota1 + ", " + kota2);
        }

    }
}
