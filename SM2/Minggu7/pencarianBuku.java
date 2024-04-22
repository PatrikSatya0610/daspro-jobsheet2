package SM2.Minggu7;

public class pencarianBuku {
    Buku listBk[] = new Buku[5];
    int idx;

    void tambah (Buku m){
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh");
        }
    }
    
    void tampil(){
        for (Buku m : listBk){
            m.tampilBuku();
        }
        
    }

    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku==cari) {
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
            System.out.println("Kode Buku :"+x);
            System.out.println("Judul Buku :"+listBk[pos].judulBuku);
            System.out.println("Tahun Terbit :"+listBk[pos].tahunTerbit);
            System.out.println("Pengarang :"+listBk[pos].pengarang);
            System.out.println("Stock :"+listBk[pos].stock);
        }else{
            System.out.println("Data"+x+"tidak ditemukan");
        }
    }

    public int FindbinarySearch(int cari,int left,int right){
        int mid;
        if (right>=left) {
            mid=(right)/2;
            if (cari==listBk[mid].kodeBuku) {
                return (mid);
            }else if(listBk[mid].kodeBuku>cari){
                return FindbinarySearch(cari, left, mid);
            }else{
                return FindbinarySearch(cari, mid, right);
            }
        }
        return -1;
    }
}
