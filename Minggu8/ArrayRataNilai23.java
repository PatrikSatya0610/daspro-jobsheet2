package Minggu8;
import java.util.Scanner;

public class ArrayRataNilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nilaiMhs = new int[10];
        int tdkLulus=0;
        double total1=0, total2=0, rata2Lulus, rata2TdkLulus;

        System.out.println("Masukkan jumlah mahasiswa : ");
        int jmlMhs = sc.nextInt();

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < jmlMhs; i++) {
            if (nilaiMhs[i] > 70) {
            total1 += nilaiMhs[i];
            }
        }

        for (int i = 0; i < jmlMhs; i++) {
            if (nilaiMhs[i] <= 70) {
            total2 += nilaiMhs[i];
            tdkLulus++;
            }
        }

        int totalLulus = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i]>70) {
                totalLulus++;
            }
        }

        rata2Lulus = total1/totalLulus;
        rata2TdkLulus = total2/tdkLulus;
        System.out.println("Rata-rata nilai lulus = "+rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = "+rata2TdkLulus);
        System.out.println("Banyaknya mahasiswa yang lulus : "+totalLulus);
    }
}
