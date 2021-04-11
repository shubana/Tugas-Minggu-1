package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int JumlahMhs = 8, JumlahJwbn = 10;
        char[][] jawabanMhs = {
        {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
        {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'}, {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
        {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        char[] Kuncijawaban = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[] result = new int[JumlahMhs];

        for(int i=0; i<JumlahMhs; ++i) {
            int jawabanbenar = 0;
            for(int j=0; j<JumlahJwbn; ++j) {
                if(jawabanMhs[i][j] == Kuncijawaban[j]) {
                    jawabanbenar++;
                }
            }
            result[i] = jawabanbenar;
        }

        System.out.println("jawaban benar masing-masing mahasiswa: \n");
        for(int i=0; i<JumlahMhs; ++i) {
            System.out.println("Mhs " + i + " jumlah jawaban benar adalah " + result[i]+" dari 10 Soal");
        }
    }
}
