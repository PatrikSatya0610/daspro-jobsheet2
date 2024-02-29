package Minggu5;

import java.util.Scanner;

public class PemilihanPercobaan1_23 {
    public static void main(String[] args) {
     Scanner input23 = new Scanner(System.in);

     System.out.print("Masukkan Angka :");
     int angka = input23.nextInt();
    
     if (angka % 2 == 0)
     System.out.println("Angka "+angka+"Bilangan Genap");
     else
     System.out.println("Angka "+angka+"Bilangan Ganjil" );
    }
}
