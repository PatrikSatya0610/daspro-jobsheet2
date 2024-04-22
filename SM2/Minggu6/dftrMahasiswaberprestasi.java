package SM2.Minggu6;

public class dftrMahasiswaberprestasi {
    mahasiswa listMahasiswa[] = new mahasiswa[5];
    int idx;
    
    void tambah(mahasiswa m){
        if (idx<listMahasiswa.length) {
            listMahasiswa[idx] = m;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil(){
        for (mahasiswa m : listMahasiswa) {
            m.tampil();
            System.out.println("-------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < listMahasiswa.length-1; i++) {
            for (int j = 1; j < listMahasiswa.length-i; j++) {
                if(listMahasiswa[j].ipk>listMahasiswa[j-1].ipk){
                    mahasiswa tmp=listMahasiswa[j];
                    listMahasiswa[j]=listMahasiswa[j-1];
                    listMahasiswa[j-1]=tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < listMahasiswa.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listMahasiswa.length; j++) {
                if (listMahasiswa[j].ipk<listMahasiswa[idxMin].ipk) {
                    idxMin=j;
                }
            }
            mahasiswa tmp = listMahasiswa[idxMin];
            listMahasiswa[idxMin] = listMahasiswa[i];
            listMahasiswa[i] = tmp;;
        }
    }

    void insertionnSort(){
        for (int i = 1; i < listMahasiswa.length; i++) {
            mahasiswa temp = listMahasiswa[i];
            int j = i;
            while (j>0 && listMahasiswa[j-1].ipk > temp.ipk) {
                listMahasiswa[j] = listMahasiswa[j-1];
                j--;
            }
            listMahasiswa[j] = temp;
        }
    } 
}
