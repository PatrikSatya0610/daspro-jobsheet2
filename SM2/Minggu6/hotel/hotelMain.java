package SM2.Minggu6.hotel;

public class hotelMain {
    public static void main(String[] args) {
        
        hotelService list= new hotelService();
        hotel h1 = new hotel("Hotel Paus", "Malang", 150000, (byte)1);
        hotel h2 = new hotel("Hotel Kakap", "Batu", 300000, (byte)3);
        hotel h3 = new hotel("Hotel Tuna", "Surabaya", 200000,(byte)2);
        hotel h4 = new hotel("Hotel Hiu", "Bogor", 350000, (byte)4);
        hotel h5 = new hotel("Hotel Lele", "Malang", 550000, (byte)5);
        
        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("Daftar Hotel Sebelum di Sorting");
        list.tampil();

        System.out.println("Daftar Hotel setelah sorting desc berdasarkan Bintang = ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Daftar Hotel setelah sorting asc berdasarkan Bintang = ");
        list.selectionSort();
        list.tampil();
    }
}
