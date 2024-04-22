package SM2.quiz;

public class transaksi {

    private Kamera kamera;
    private penyewa penyewa;
    private Date tanggalSewa;
    private Date tanggalKembali;
    private Date time;
    private int hargaSewaTotal;

    public transaksi(Kamera kamera, penyewa penyewa, java.util.Date date) {
        this.kamera = kamera;
        this.penyewa = penyewa;
        this.tanggalSewa = tanggalSewa;
        this.tanggalKembali = null;
        this.time = null;
        this.hargaSewaTotal = 0;
    }

    public Kamera getKamera() {
        return kamera;
    }

    public void setKamera(Kamera kamera) {
        this.kamera = kamera;
    }

    public penyewa getPenyewa() {
        return penyewa;
    }

    public void setPenyewa(penyewa penyewa) {
        this.penyewa = penyewa;
    }

    public Date getTanggalSewa() {
        return tanggalSewa;
    }

    public void setTanggalSewa(Date tanggalSewa) {
        this.tanggalSewa = tanggalSewa;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    public Date getTime(){
        return time;
    }

    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;

        // Hitung harga sewa total
        // if (tanggalKembali != null && tanggalSewa != null) {
        //     long selisihHari = (tanggalKembali.getTime() - tanggalSewa.getTime()) / (1000 * 60 * 60 * 24);
        //     hargaSewaTotal = (int) (selisihHari * kamera.getHargaSewa());
        // }
    }

    public int getHargaSewaTotal() {
        return hargaSewaTotal;
    }

}

