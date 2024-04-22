package SM2.quiz;

public class Kamera {
    private String nama;
    private boolean tersedia;

    public Kamera(String nama, boolean tersedia) {
        this.nama = nama;
        this.tersedia = tersedia;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}
