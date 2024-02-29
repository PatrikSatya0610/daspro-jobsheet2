package SM2.Minggu3.segitiga;

public class segitiga {
    public int alas;
    public int tinggi;

    public segitiga(int a,int t){
        alas=a;
        tinggi=t;
    }

    public double hitungLuas(){
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling(){
        double miring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return miring + alas + tinggi;
    }
}
