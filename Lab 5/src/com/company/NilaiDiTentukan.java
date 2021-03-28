package com.company;

public class NilaiDiTentukan {
    public static void main(String[] args){

        Tabung objek = new Tabung();
        double r = objek.radius = 5;
        double t = objek.tinggi = 10;

        System.out.println("== Nilai Radius 5 & Tinggi 10 ==");
        System.out.println("Nilai radius di Nilai default: "+ r );
        System.out.println("Nilai Tinggi di Nilai default: "+ t );
        System.out.println("Nilai Luas Alas Tabung: "+ objek.getLuasAlas());
        System.out.println("Nilai Volume Tabung: "+ objek.getVolume());

        Tabung objek2 = new Tabung();
        double r2 = objek2.radius = 7.5;
        double t2 = objek2.tinggi = 15.5;

        System.out.println("\n\n== Nilai Radius 7.5 & Tinggi 15.5 ==");
        System.out.println("Nilai radius di Nilai default: "+ r2 );
        System.out.println("Nilai Tinggi di Nilai default: "+ t2 );
        System.out.println("Nilai Luas Alas Tabung: "+ objek2.getLuasAlas());
        System.out.println("Nilai Volume Tabung: "+ objek2.getVolume());
    }
}
