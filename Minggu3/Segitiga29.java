package Minggu3;

import java.util.Scanner;

public class Segitiga29 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            int alas;
            int tinggi;
            float luas;

            System.out.print("Masukan alas : ");
            alas = sc.nextInt();
            System.out.print("Masukan tinggi : ");
            tinggi = sc.nextInt();

            luas = alas * tinggi / 2;
            System.out.println("Luas segitiga : "+ luas);
        }
    }
}
