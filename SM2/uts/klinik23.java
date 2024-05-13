package SM2.uts;

public class klinik23 {
    String nama_pasien,jenis_kelamin,diagnosa,bulan_periksa;
    int tanggal_periksa;

    klinik23(String np, String jk,String dg,int tp,String bp){
        nama_pasien = np;
        jenis_kelamin = jk;
        diagnosa = dg;
        tanggal_periksa = tp;
        bulan_periksa = bp;
    }
    void tampil(){
        System.out.println("Nama Pasien ="+nama_pasien);
        System.out.println("Jenis Kelamin ="+jenis_kelamin);
        System.out.println("Diagnosa ="+diagnosa);
        System.out.println("Tanggal Periksa ="+tanggal_periksa); 
        System.out.println("Bulan Periksa ="+bulan_periksa); 
     }
}