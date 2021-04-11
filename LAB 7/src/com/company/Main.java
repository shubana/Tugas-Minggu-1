package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        course matkul1 = new course("Multimedia system");
        course matkul2 = new course("Object O Programing");

        matkul1.addStudent("Peter jones");
        matkul1.addStudent("Kim Smith");
        matkul1.addStudent("Anne Kennedy");

        matkul2.addStudent("Peter Jones");
        matkul2.addStudent("steve Smith");

        System.out.println("Number of Student in matkul1: "+ matkul1.getNumberStuden());
        ArrayList<String> matkul1student = matkul1.getStudents();
        for(int i=0; i<matkul1student.size(); i++){
            System.out.println(matkul1student.get(i) + ", ");
        }
        System.out.println("Number of Student in matkul2: "+ matkul2.getNumberStuden());
        ArrayList<String> matkul2student = matkul2.getStudents();
        for(int i=0; i<matkul2student.size(); i++){
            System.out.println(matkul2student.get(i) + ", ");
        }
        System.out.println("\nDrop Student in matkul1: ");
        matkul1.hapus("Peter jones");
        System.out.print("Number of Students in matkul1: "+ matkul1.getNumberStuden());
        for(int i=0; i<matkul1student.size();i++){
            if(i == matkul1student.size() - 1){
                System.out.println(matkul1student.get(i));
            }else
                System.out.println(matkul1student.get(i)+ ", ");
        }
    }
}
