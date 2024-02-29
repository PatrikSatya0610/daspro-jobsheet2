package SM2.Minggu3.persegiPanjang;
import java.util.Scanner;
public class ArrayObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        persegiPanjang[] ppArray = new persegiPanjang[3];

        ppArray [0]= new persegiPanjang();
        ppArray [0].panjang = 110; 
        ppArray [0].lebar = 30;
        
        ppArray [1]= new persegiPanjang();
        ppArray [1].panjang = 80; 
        ppArray [1].lebar = 40;

        ppArray [2]= new persegiPanjang();
        ppArray [2].panjang = 100; 
        ppArray [2].lebar = 20;


        for (int i = 0; i < 3; i++ ) {
            ppArray[i] = new persegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Masukkan Panjang :");
            ppArray[i].panjang = sc.nextInt();
            System.out.println("Masukkan Lebar :");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang :" + ppArray[i].panjang+", Lebar :"+ppArray[i].lebar);    
        }
        
    }
    
}
