package SM2.uts;

public class klinik23Main {
    public static void main(String[] args) {
        klinikbrobat23 list = new klinikbrobat23();
        klinik23 p1 = new klinik23("Agung", "Laki-laki" , "Pernapasan", 3, "januari");
        klinik23 p2 = new klinik23("Rafa", "Perempuan" , "Jantung", 1, "januari");
        klinik23 p3 = new klinik23("jibel", "Laki-laki" , "Stroke", 2, "januari");
        
        list.tambah(p1);
        list.tambah(p2);
        list.tambah(p3);

        System.out.println("Data Sebelum Sorting =");
        list.tampil();

        System.out.println("Data Pasien setelah sorting desc berdasarkan Tanggal Periksa = ");
        list.insertionnSort();
        list.tampil();

        System.out.println("--------------------------------------");
        System.out.println("Data Keseluruhan Pasien");
        list.tampil();

        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("Pencarian Data :");
        System.out.println("Masukkan Tanggal Periksa yang Dicari :");
        System.out.println("Tanggal Periksa :");
        int cari = k.nextInt();
        System.out.println("Menggunakan sequential search :");
        int posisi = list.FindSeqSearch(cari);
        list.tampilPosisi(cari, posisi);
        list.tampilData(cari, posisi);
    }
}