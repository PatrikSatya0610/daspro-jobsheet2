package SM2.jb11.BT;

public class binaryTree23 {
    node23 root;

    public binaryTree23(){
        root = null;
    }
    boolean isEmpty(){
        return root == null;
    }

    void add(int data){
        if (!isEmpty()) {
            root = new node23(data);
        }else{
            node23 current = root;
            while (true) {
                if (data>current.data) {
                    if (current.right==null) {
                        current.right = new node23(data);
                        break;
                    }else{
                        current = current.right;
                    }
                }else if(data<current.data){
                    if (current.left==null) {
                        current.left = new node23(data);
                        break;
                    }else{
                        current = current.left;
                    }
                }else{
                    break;
                }
            }
        }
    }

    boolean find(int data){
        node23 current = root;
        while (current!=null) {
            if (current.data==data) {
                return true;
            }else if(data>current.data){
                current = current.right;
            }else{
                current = current.left;
            }
        }
        return false;
    }

    void traversePreorder(node23 node){
        if (node !=null) {
            System.out.print(" "+ node.data);
            traversePreorder(node.left);
            traversePreorder(node.right);
        }
    }
    void traversePostorder(node23 node){
        if (node !=null) {
            traversePreorder(node.left);
            traversePreorder(node.right);
            System.out.print(" "+ node.data);
        }
    }
    void traverseInorder(node23 node){
        if (node !=null) {
            traversePreorder(node.left);
            System.out.print(" "+ node.data);
            traversePreorder(node.right);
        }
    }

    node23 getSuccessor(node23 del){
        node23 successor = del.right;
        node23 successorParent = del;
        while (successor.left!=null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor!=del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    void delete(int data){
        if (isEmpty()) {
            System.out.println("Tree is Empty");
            return;
        }
        node23 parent = null;
        node23 current = root;
        boolean isLeftChild = false;
        while (current!=null && current.data != data) {
            parent = current;
            if (data < current.data) {
                current = current.left;
                isLeftChild = true;
            }else if (data<current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else {
                current = current.right;
                isLeftChild = false;
            }
            if (current==null) {
                System.out.println("Cloudn't find data");
                return;
            }
                if (current.left==null&&current.right==null) {
                    if (current==root) {
                        root = null;
                    }else if (isLeftChild) {
                            parent.left = null;
                        }else{
                            parent.right = null;
                        }
                    
                }else if (current.left==null) {
                    if (current==root) {
                        root = current.right;
                    }else if (isLeftChild) {
                            parent.left = current.right;
                        }else{
                            parent.right = current.right;
                    }
                }else if (current.right==null) {
                    if (current==root) {
                        root = current.left;
                    }else if (isLeftChild) {
                            parent.left = current.left;
                        }else{
                            parent.right = current.left;
                        
                    }
                }else{
                    node23 successor = getSuccessor(current);
                    if (current==root) {
                        root = successor;
                    }else if (isLeftChild){
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        
    }
}
