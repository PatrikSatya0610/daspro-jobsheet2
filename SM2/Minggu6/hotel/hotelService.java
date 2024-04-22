package SM2.Minggu6.hotel;

public class hotelService {
    hotel hotellist[] = new hotel[5];
    int idx;
    
    void tambah(hotel h){
        if (idx<hotellist.length) {
            hotellist[idx] = h;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil(){
        for (hotel h : hotellist) {
            h.tampil();
            System.out.println("-------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < hotellist.length-1; i++) {
            for (int j = 1; j < hotellist.length-i; j++) {
                if(hotellist[j].bintang>hotellist[j-1].bintang){
                    hotel tmp=hotellist[j];
                    hotellist[j]=hotellist[j-1];
                    hotellist[j-1]=tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < hotellist.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < hotellist.length; j++) {
                if (hotellist[j].bintang<hotellist[idxMin].bintang) {
                    idxMin=j;
                }
            }
            hotel tmp = hotellist[idxMin];
            hotellist[idxMin] = hotellist[i];
            hotellist[i] = tmp;;
        }
    }
}
