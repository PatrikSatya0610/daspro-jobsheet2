package SM2.jb11.BTA;

public class binaryTreeArray {
    int [] data;
    int idxLast;
    //int idxStart;
    //private int idxStart;

    public binaryTreeArray(){
        data = new int[10];
    }
    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
        //this.idxStart = idxStart;
    }
    void traverseInorder(int idxStart){
        if (idxStart<=idxLast) {
            traverseInorder(2*idxStart+1);
            System.out.println(data[idxStart]+"");
            traverseInorder(2*idxStart+2);
        }
    }
}
