package SM2.Minggu6.hotel;

public class hotel {
    String nama,kota;
    int harga;
    byte bintang;

    hotel(String n,String k,int h,byte b){
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }
    void tampil(){
       System.out.println("Nama Hotel ="+nama);
       System.out.println("Kota ="+kota);
       System.out.println("Harga ="+harga);
       System.out.println("Bintang ="+bintang); 
    }
}
