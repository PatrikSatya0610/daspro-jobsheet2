package SM2.uts;

public class klinik23 {
    String nama_pasien,jenis_kelamin,diagnosa,bulan_periksa;
    int tanggal_periksa;

    klinik23(String nama_pasien, String jenis_kelamin,String diagnosa,int tanggal_periksa,String bulan_periksa){
        nama_pasien = np;
        jenis_kelamin = jk;
        diagnosa = dg;
        tanggal_periksa = tp;
        bulan_periksa = bp;
    }
    void tampil(){
        System.out.println("Nama Pasien ="+np);
        System.out.println("Jenis Kelamin ="+jk);
        System.out.println("Diagnosa ="+dg);
        System.out.println("Tanggal Periksa ="+tp); 
        System.out.println("Bulan Periksa ="+bp); 
     }
}
