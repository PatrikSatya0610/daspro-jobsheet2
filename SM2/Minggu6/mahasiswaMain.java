package SM2.Minggu6;

public class mahasiswaMain {
    public static void main(String[] args) {
        
        dftrMahasiswaberprestasi list = new dftrMahasiswaberprestasi();
        mahasiswa m1 = new mahasiswa("Nusa", 2017, 25, 3);
        mahasiswa m2 = new mahasiswa("Rara", 2012, 19, 4);
        mahasiswa m3 = new mahasiswa("Dompul", 2018, 19, 3.5);
        mahasiswa m4 = new mahasiswa("Abdul", 2017, 23, 2);
        mahasiswa m5 = new mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Sebelum Sorting =");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan IPK = ");
        list.bubbleSort();
        list.tampil();
    }
}
