package SM2.quiz;

public class penyewa {
    public int notlp;
    public double tglsewa;

    private String nama;
        private String alamat;
        private String nomorTelepon;
    
        public penyewa(String nama, String alamat, String nomorTelepon) {
            this.nama = nama;
            this.alamat = alamat;
            this.nomorTelepon = nomorTelepon;
        }
    
        public String getNama() {
            return nama;
        }
    
        public void setNama(String nama) {
            this.nama = nama;
        }
    
        public String getAlamat() {
            return alamat;
        }
    
        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }
    
        public String getNomorTelepon() {
            return nomorTelepon;
        }
    
        public void setNomorTelepon(String nomorTelepon) {
            this.nomorTelepon = nomorTelepon;
        }
    



}
