package Minggu3;

import java.util.Scanner;

public class Latihan23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double R1,R2,R3,R4,V,I,Rtotal,Rp;

        System.out.println("Masukkan nilai R1 : ");
        R1 = sc.nextDouble();

        System.out.println("Masukkan nilai R2 : ");
        R2 = sc.nextDouble();

        System.out.println("Masukkan nilai R3 : ");
        R3 = sc.nextDouble();

        System.out.println("Masukkan nilai R4 : ");
        R4 = sc.nextDouble();

        System.out.println("Masukkan nilai I : ");
        I = sc.nextDouble();

        Rp = 1 / (((1/R1) + (1/R2) + (1/R3)));
        Rtotal = R4 + Rp;

        V = I * Rtotal;

        System.out.println("\nRp = " + Rp);
        System.out.println("Rtotal = " + Rtotal);
        System.out.println("I = " + I);
        System.out.println("V = I * Rtotal = " + V);

    }

}
