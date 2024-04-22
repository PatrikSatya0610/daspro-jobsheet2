package SM2.Minggu7;

public class Buku {
    int kodeBuku,tahunTerbit,stock;
    String judulBuku,pengarang;

    public Buku(int kb,String jb,int tb,String pg,int st){
        kodeBuku = kb;
        judulBuku = jb;
        tahunTerbit = tb;
        pengarang = pg;
        stock = st;
    }

    public void tampilBuku(){
        System.out.println("=================");
        System.out.println("Kode Buku :"+kodeBuku);
        System.out.println("Judul Buku :"+judulBuku);
        System.out.println("Tahun Terbit :"+tahunTerbit);
        System.out.println("Pengarang :"+pengarang);
        System.out.println("Stock :"+stock);
    }
}
