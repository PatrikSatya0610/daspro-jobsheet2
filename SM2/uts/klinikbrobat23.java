package SM2.uts;

public class klinikbrobat23 {
    klinik23 klinik23s[] = new klinik23[3];
    int idx;
    
    void tambah(klinik23 k){
        if (idx<klinik23s.length) {
            klinik23s[idx] = h;
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

    void bubbleSort(){
        for (int i = 0; i < klinik23s.length-1; i++) {
            for (int j = 1; j < klinik23s.length-i; j++) {
                if(klinik23s[j].tp>klinik23s[j-1].tp){
                    klinik23 tmp=klinik23s[j];
                    klinik23s[j]=klinik23s[j-1];
                    klinik23s[j-1]=tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < klinik23s.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < klinik23s.length; j++) {
                if (klinik23s[j].tp<klinik23s[idxMin].tp) {
                    idxMin=j;
                }
            }
            klinik23 tmp = klinik23s[idxMin];
            klinik23s[idxMin] = klinik23s[i];
            klinik23s[i] = tmp;;
        }
    }
    void insertionnSort(){
        for (int i = 1; i < klinik23s.length; i++) {
            klinik23 temp = klinik23s[i];
            int j = i;
            while (j>0 && klinik23s[j-1].tp > temp.tp) {
                klinik23s[j] = klinik23s[j-1];
                j--;
            }
            klinik23s[j] = temp;
        }
    } 
}

