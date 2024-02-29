package Minggu5;

import java.util.Scanner;

public class PemilihanPercobaan2_23 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

        System.out.print("Nilai UAS : ");
        float uas = input23.nextFloat();
        System.out.print("Nilai UTS : ");
        float uts = input23.nextFloat();
        System.out.print("Nilai Kuis : ");
        float kuis = input23.nextFloat();
        System.out.print("Nilai Tugas : ");
        float tugas = input23.nextFloat();
        String predikat;

        float total = (uas * 0.4F)+(uts * 0.4F)+(kuis * 0.1F)+(tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak remidi";

        if (total > 80 && total <= 100){
            predikat = "A";
        }
        else if (total > 73 && total <= 80){
            predikat = "B+";
        }
        else if (total > 65 && total <= 73){
            predikat = "B";
        }
        else if (total > 60 && total <= 65){
            predikat = "C+";
        }
        else if (total > 50 && total <= 60){
            predikat = "C";
        }
        else if (total > 39 && total <= 50){
            predikat = "D";
        }
        else{predikat = "E";
        }
        
        System.out.println("Nilai Akhir = " + total + " dengan predikat " + predikat + " sehingga " + message);
    }
    
}
