package SM2.Minggu8;

public class gudang {
    barang[] tumpukan;
    int size,top;

    public gudang(int kapasitas){
        size = kapasitas;
        tumpukan = new barang[size];
        top = -1;
    }

    public boolean cekKosong(){
        if (top == -1) {
            return true;
        }else{
            return false;
        }
    }

    public boolean cekPenuh(){
        if (top == -1) {
            return true;
        }else{
            return false;
        }
    }

    public void tambahBarang(barang brg){
        if (!cekPenuh()) {
            top++;
            tumpukan[top]=brg;
            System.out.println("Barang"+brg.nama+"Berhasil ditambahkan ke Gudang");
        }else{
            System.out.println("Gagal! Barang di Gudang sudah Penuh");
        }
    }

    public void ambilBarang(){
        if (!cekKosong()) {
            barang delete = tumpukan[top];
            top--;
            System.out.println("Barang"+delete.nama+"diambil dari Gudang");
        }else{
            System.out.println("Tumpukan barang kosong");
            return;
        }
    }
}
