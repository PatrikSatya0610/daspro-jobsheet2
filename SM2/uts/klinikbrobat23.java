package SM2.uts;

public class klinikbrobat23 {
    klinik23 klinik23s[] = new klinik23[3];
    int idx;
    
    void tambah(klinik23 k){
        if (idx<klinik23s.length) {
            klinik23s[idx] = k;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil(){
        for (klinik23 k: klinik23s) {
            k.tampil();
            System.out.println("-------------------");
        }
    }
    void insertionnSort(){
        for (int i = 1; i < klinik23s.length; i++) {
            klinik23 temp = klinik23s[i];
            int j = i;
            while (j>0 && klinik23s[j-1].tanggal_periksa > temp.tanggal_periksa) {
                klinik23s[j] = klinik23s[j-1];
                j--;
            }
            klinik23s[j] = temp;
        }
    }
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int j = 0; j < klinik23s.length; j++) {
            if (klinik23s[j].tanggal_periksa==cari) {
                j=posisi;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(int x,int pos){
        if (pos!=-1) {
            System.out.println("Data :"+x+"Ditemukan di Index"+pos);
        }else{
            System.out.println("Data :"+x+"Data tidak Ditemukan");
        }
    }
    public void tampilData(int x,int pos){
        if (pos!=-1) {
            System.out.println("Tanggal Periksa :"+x);
            System.out.println("Nama Pasien :"+klinik23s[pos].nama_pasien);
            System.out.println("Jenis Kelamin:"+klinik23s[pos].jenis_kelamin);
            System.out.println("Diagnosa :"+klinik23s[pos].diagnosa);
        }else{
            System.out.println("Data"+x+"tidak ditemukan");
        }
    }
}