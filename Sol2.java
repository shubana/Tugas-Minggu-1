package com.company;

import java.util.Scanner;

public class Sol2 {
    public static void main(String[] args) {
        int a , b, c;
        String text1 = "Senin";
        String text2 = "Selasa";
        String text3 = "Rabu";
        String text4 = "Kamis";
        String text5 = "Jumat";
        String text6 = "Sabtu";
        String text7 = "Minggu";

        Scanner HariKeberapa = new Scanner(System.in);
        System.out.println("Masukan hari ke berapa (Contohnya hari senin adalah hari ke-1): ");
        a = HariKeberapa.nextInt();

        Scanner HariBerikutnya = new Scanner(System.in);
        System.out.println("Masukan berapa hari selanjutnya : ");
        b = HariBerikutnya.nextInt();

        if(b > 4 && b < 7 ){

            c = a+b-7;
            System.out.println("hasil dari perhitungan c = " + c + " ,Maka hari ke " + c +" adalah hari " );
            if (c == 1){
                System.out.println(text1);
            }
            else if (c == 2) {
                System.out.println(text2);
            }
            else if (c == 3) {
                System.out.println(text3);
            }
            else if (c == 4) {
                System.out.println(text4);
            }
            else if (c == 5) {
                System.out.println(text5);
            }
            else if (c == 6) {
                System.out.println(text6);
            }
            else if (c == 7) {
                System.out.println(text7);
            }
        }
        else if(b>=7){
            c = (a+(b%7));

            System.out.println("hasil modulo = " + b%7 + " ,Di tambah dengan hari ini "+ a +
                    ",Maka hari ke " + c +" adalah hari " );

            if (c == 1){
                System.out.println(text1);
            }
            else if (c == 2) {
                System.out.println(text2);
            }
            else if (c == 3) {
                System.out.println(text3);
            }
            else if (c == 4) {
                System.out.println(text4);
            }
            else if (c == 5) {
                System.out.println(text5);
            }
            else if (c == 6) {
                System.out.println(text6);
            }
            else if (c == 7) {
                System.out.println(text7);
            }
        }

    }

}
