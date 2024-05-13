package SM2.jb10.PRATIK1;

public class vaksin {
    String nama;
    int no;
    vaksin next, prev;

    public vaksin( vaksin prev, String nama, int no, vaksin next){
        this.nama = nama;
        this.no = no;
        this.next = next;
        this.prev = prev;
    }
}
