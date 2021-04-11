package com.company;

import java.util.ArrayList;

public class course {
        private String Cname;
        private ArrayList<String> students = new ArrayList<>();
        private int numberStuden = 0;

        course(String Cname){
            this.Cname = Cname;
        }

        public String getCname(){
            return Cname;
        }

        public void addStudent(String Student){
            students.add(Student);
            numberStuden++;
        }

        public void hapus(String student){
            for(int i=0; i<numberStuden; i++ ){
                if(students.get(i).equals(student)){
                    students.remove(i);
                    numberStuden--;
                    break;
                }
            }
        }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberStuden() {
        return numberStuden;
    }


}
