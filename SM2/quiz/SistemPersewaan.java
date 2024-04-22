package SM2.quiz;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class SistemPersewaan {
    private static final Kamera Kamera = null;
    private ArrayList<barang> daftarKamera;
    private ArrayList<penyewa> daftarPenyewa;
    private ArrayList<transaksi> daftarTransaksi;


    public SistemPersewaan() {
        this.daftarKamera = new ArrayList<>();
        this.daftarPenyewa = new ArrayList<>();
        this.daftarTransaksi = new ArrayList<>();
    }

    public void menyewaBarang(SM2.quiz.Kamera kamera1, penyewa penyewa, Date date) {
        if (kamera1 == null || penyewa == null || date == null) {
            throw new IllegalArgumentException("Data tidak boleh null");
        }

        if (!kamera1.isTersedia()) {
            throw new IllegalStateException("Barang tidak tersedia");
        }

        transaksi transaksi = new transaksi(Kamera , penyewa, date);
        daftarTransaksi.add(transaksi);

        kamera1.setTersedia(false);
    }

    public void mengembalikanBarang(barang barang, Date tanggalKembali) {
        if (barang == null || tanggalKembali == null) {
            throw new IllegalArgumentException("Data tidak boleh null");
        }
    }
        private transaksi findTransaksiByBarang(Kamera kamera) {
            for (transaksi transaksi : daftarTransaksi) {
                if (transaksi.getKamera().equals(kamera)) {
                    return transaksi;
                }
            }
            return null;
        }


    public void menampilkanLaporan() {
        for (transaksi transaksi : daftarTransaksi) {
            System.out.println("Nama Barang: " + transaksi.getKamera().getNama());
            System.out.println("Nama Penyewa: " + transaksi.getPenyewa().getNama());
            System.out.println("Tanggal Sewa: " + transaksi.getTanggalSewa());
            System.out.println("Tanggal Kembali: " + transaksi.getTanggalKembali());
            System.out.println("Harga Sewa Total: " + transaksi.getHargaSewaTotal());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kamera kamera1 = new Kamera("Canon EOS M50 Mark II", true);
        Kamera kamera2 = new Kamera("Sony A6000", true);
        penyewa penyewa1 = new penyewa("Andi", "Jl. Merdeka 1", "08123456789");
        penyewa penyewa2 = new penyewa("Budi", "Jl. Sudirman 2", "08987654321");

        SistemPersewaan sistemPersewaan = new SistemPersewaan();
        sistemPersewaan.menyewaBarang(kamera1, penyewa1, new Date());
        sistemPersewaan.menyewaBarang(kamera2, penyewa2, new Date());
        // sistemPersewaan.menyewaBarang(barang2, penyewa2, new Date());

}
}
