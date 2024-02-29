package SM2.Minggu3.segitiga;

public class ArraySegitiga {
    public static void main(String[] args) {
        segitiga[]sgArray = new segitiga[4];

        sgArray[0] = new segitiga(10,4);
        sgArray[1] = new segitiga(20,10);
        sgArray[2] = new segitiga(15,6);
        sgArray[3] = new segitiga(25,10);

        for (int i = 0; i < 4; i++) {
            System.out.printf("Segitiga ke- "+i+" : Alas = %d, Tinggi = %d, Luas = %.2f, Keliling = %.2f\n",sgArray[i].alas,
            sgArray[i].tinggi,sgArray[i].hitungLuas(),sgArray[i].hitungKeliling());
        }
    }
}
