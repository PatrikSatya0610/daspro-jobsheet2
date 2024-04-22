package SM2.Minggu5;

import java.util.Scanner;
public class mainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------");
        System.out.println("Masukkan jumlah elemen : ");
        int jml = sc.nextInt();

        Faktorial[]fk=new Faktorial[10];
        for (int i = 0; i < jml; i++) {
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai data ke-"+ (i+1) +":");
            int nilai = sc.nextInt();
        }

        System.out.println("Hasil - BRUTE FORCE");
        for (int i = 0; i < jml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan BRUTE FOORCE adalah"+fk[i].faktorialBF(fk[i].nilai));  
        }
        System.out.println("Hasil - DEVIDE AND CONQUER");
        for (int i = 0; i < jml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan DEVIDE AND CONQUER adalah"+fk[i].faktorialDC(fk[i].nilai));  
        }
    }
}
