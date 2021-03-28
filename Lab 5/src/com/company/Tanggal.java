package com.company;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;


public class Tanggal {

    public static void main(String[] args)  {
        // write your code here

        Calendar calndr = Calendar.getInstance();
        SimpleDateFormat contoh2 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat ev = new SimpleDateFormat("yyyy-MM-dd");

        //tanggal sekarang
        String Tanggal2 = contoh2.format(calndr.getTime());
        String hitung1 = ev.format(calndr.getTime());
        System.out.println("Tanggal hari ini: " + Tanggal2 +" atau "+ hitung1);


        //tanggal sistem
        calndr.setTimeInMillis(2000);
        String Tanggal3 = contoh2.format(calndr.getTime());
        String hitung2 = ev.format(calndr.getTime());
        System.out.println("Tanggal sistem Calender: " + Tanggal3 + " atau "+ hitung2);


        LocalDate sebelum = LocalDate.parse(hitung2);
        LocalDate sesudah = LocalDate.parse(hitung1);

        long Daybetween = ChronoUnit.DAYS.between(sebelum,sesudah);
        long month = ChronoUnit.MONTHS.between(sebelum,sesudah);
        long year = ChronoUnit.YEARS.between(sebelum,sesudah);


        System.out.println(String.format("Jumlah Waktu yang sudah berlalu Hingga saat ini adalah %d Tahun %d bulan, %d Hari ",year,month,Daybetween));





    }

}