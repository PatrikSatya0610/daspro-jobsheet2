package SM2.jb10.PRATIK1;

import java.util.Scanner;

public class dllvakMain {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        dllvak pasien = new dllvak();
        int menu;
        do {
            System.out.println("===============================");
            System.out.println("|   DAFTAR PENGANTRI VAKSIN   |");
            System.out.println("===============================");
            System.out.println("1. Tambah Data Penerima Vaksin|");
            System.out.println("2. Hapus Data Penerima Vaksin |");
            System.out.println("3. Daftar Penerima Vaksin     |");
            System.out.println("4. Keluar                     |");                  
            System.out.println("------------------------------");
            System.out.print("Silahkan Pilih Menu Yang Diinginkan :");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("==============================");
                    System.out.println("|     Data Penerima Vaksin   |");
                    System.out.println("==============================");
                    System.out.print("Nama          : ");
                    String nama = sc.nextLine();
                    System.out.print("Nomor Antrian : ");
                    int no = sc.nextInt();
                    pasien.add(no, nama);
                    break;
                case 2:
                    pasien.remove();
                    break;
                case 3:
                    System.out.println("==============================");
                    System.out.println("|     Data Penerima Vaksin   |");
                    System.out.println("==============================");
                    pasien.print();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("input yang dimasukkan salah");
                    break;
            }
        } while (menu != 4);
    }
}
    
    