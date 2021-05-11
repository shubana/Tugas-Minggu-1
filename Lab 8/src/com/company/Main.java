package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        //  User akses = new User("SggTzy","asd123fg" );
        Admin daat = new Admin("AA01", "asd123123", "Joshua sabas", "Joshua.nirwana@binus.ac.id");
        Customer taat = new Customer("CC001", "akudandia", "Ruth Ade", "JL. Terusan Sultan Agung Atas No. 25 Kota Batu, Malang",
                "RuthA@gm.vom", "99884772-3998", "05/22", "988");

        System.out.print("\nSiapa kamu?[admin or customer]: ");
        String aa = data.nextLine();
        if (!aa.equalsIgnoreCase("customer")) {
            System.out.print("masukkan Email: ");
            String bb = data.nextLine();
            System.out.print("masukkan Password: ");
            String cc = data.nextLine();
            System.out.println("anda sebagai Admin\n");
        }else{
            System.out.print("masukkan Email: ");
            String dd = data.nextLine();
            System.out.print("masukkan Password: ");
            String ee = data.nextLine();
            System.out.println("anda sebagai customer\n");
        }


        System.out.println("Admin ");
        System.out.println("User Id: " + daat.getUserId());
        System.out.println("Nama: "+ daat.getAdmin_name());
        System.out.println("Email: " + daat.getEmail());

        System.out.println("\nCustomer");
        System.out.println("User Id: " + taat.getUserId());
        System.out.println("Customer Name: " + taat.getCustomer_name());
        System.out.println("Alamat : " + taat.getAddress());
        System.out.println("Email : " + taat.getEmail());
        System.out.println(taat.tagihan(20000, 20));


    }
}


