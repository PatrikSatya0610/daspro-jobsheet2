package SM2.Minggu7;

import java.util.Scanner;

public class BukuMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
    
        pencarianBuku data = new pencarianBuku();
        int jumBuku = 5;   

        System.out.println("----------------------------");
        System.out.println("Masukkan data buku secara urut dari Kode Buku Terkecil");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("------------------------");
            System.out.print("Kode Buku\t:");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku\t:");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit\t:");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang\t:");
            String pengarang = s1.nextLine();
            System.out.print("Stock\t\t:");
            int stock = s.nextInt();

            Buku m = new Buku(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("--------------------------------------");
        System.out.println("Data Keseluruhan Buku");
        data.tampil();

        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("Pencarian Data :");
        System.out.println("Masukkan Kode Buku yang Dicari :");
        System.out.println("Kode buku :");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential search :");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        System.out.println("============================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.FindbinarySearch(cari, 0, jumBuku -1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}
