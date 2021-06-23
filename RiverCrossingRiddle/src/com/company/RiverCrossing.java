package com.company;

public class RiverCrossing {
    public static void main(String[] args) {
        System.out.println("Anda harus membantu zebra dan singa menyeberangi sungai dengan ketentuan sebagai berikut:" +
                " \n1. Rakit membutuhkan setidaknya satu hewan per gerakan \n2. Jika zebra kalah jumlah, singa akan membunuh mereka" +
                "\n3. Hewan tidak bisa berenang, HARUS menggunakan rakit");
        System.out.println("\nGrafik sederhana di bawah ini mewakili situasinya. Semua hewan harus dibawa ke sisi kanan menggunakan rakit di sungai..\nreparatif 'Z' mewakili zebra sementara 'L' mewakili singa\n");
        System.out.println("--------------------------------\n"
                + "           |       |    Z L    \n"
                + "Right Side | River |    Z L    Left Side\n"
                + "  (Goal)   |       |    Z L    \n"
                + "--------------------------------\n");
        Solution soul = new Solution();

    }
}
