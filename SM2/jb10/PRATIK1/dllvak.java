package SM2.jb10.PRATIK1;

public class dllvak {
    vaksin head;
    int size;

    public dllvak(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int no, String nama){
        if (isEmpty()) {
            head = new vaksin(null, nama, no, null);
        } else {
            vaksin node = new vaksin(null, nama, no, head);
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void add(int no, String nama){
        if (isEmpty()) {
            addFirst(no, nama);
        } else {
            vaksin current  = head;
            while (current.next != null) {
                current = current.next;
            }
            vaksin node = new vaksin(current, nama, no, null);
            current.next = node;
            size++;
        }
    }

    public void remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Tidak ada yang mengantri");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            vaksin penerima = head.prev;
            System.out.println(penerima.nama + " telah divaksinasi");
            head.prev = null;
            size--;
            
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Tidak ada yang mengantri");
        } else if (head.next == null) {
            vaksin penerima = head;
            System.out.println(penerima.nama + " telah divaksinasi");
            head = null;
            size--;
            return;
        }
    }

    public void print(){
        if (!isEmpty()) {
            vaksin tmp = head;
            System.out.println("|No.\t|Nama\t\t     |");
            while (tmp != null) {
                System.out.println("|" + tmp.no  + "\t| " + tmp.nama + "\t\t     |");
                System.out.println("------------------------------");
                tmp = tmp.next;
            }
            System.out.println("Sisa Antrian : "+ size);
        } else {
            System.out.println("Tidak ada yang mengantri");
        }
    }
}
