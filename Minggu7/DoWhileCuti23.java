package Minggu7;

import java.util.Scanner;

public class DoWhileCuti23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah Cuti : ");
        jatahCuti = sc.nextInt();

        do{
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if(konfirmasi.equalsIgnoreCase("y")){
                do{
                    System.out.print("Jumlah hari : ");
                    jumlahHari = sc.nextInt();

                    if (jumlahHari <= jatahCuti) {
                        jatahCuti -= jumlahHari;
                        System.out.println("Sisa jatah cuti : " + jatahCuti);
                        break;
                        
                    }else {
                        System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                    }
                } while (jatahCuti > 0);
            }else if (konfirmasi.equalsIgnoreCase("t")){
                System.out.println("Selamat Menikmat Cuti Anda");
                break;
            }
        } while (jatahCuti > 0); 
    }
}