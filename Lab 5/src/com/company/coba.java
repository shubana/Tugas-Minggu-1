package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class coba {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        SimpleDateFormat contoh1 = new SimpleDateFormat("EE, dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat contoh2 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat contoh3 = new SimpleDateFormat("d-MMM-yyyy");
        SimpleDateFormat contoh4 = new SimpleDateFormat("EEEE, d MMMM yyyy");
        SimpleDateFormat contoh5 = new SimpleDateFormat("HH:mm:ss");

        String Tanggal1 = contoh1.format(cal.getTime());
        String Tanggal2 = contoh2.format(cal.getTime());
        String Tanggal3 = contoh3.format(cal.getTime());
        String Tanggal4 = contoh4.format(cal.getTime());
        String Tanggal5 = contoh5.format(cal.getTime());

        System.out.println(Tanggal1);
        System.out.println(Tanggal2);
        System.out.println(Tanggal3);
        System.out.println(Tanggal4);
        System.out.println(Tanggal5);
    }
}
