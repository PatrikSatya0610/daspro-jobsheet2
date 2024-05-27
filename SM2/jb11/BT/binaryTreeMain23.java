package SM2.jb11.BT;

public class binaryTreeMain23 {
    public static void main(String[] args) {
        binaryTree23 bt = new binaryTree23();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        System.out.print("PreOrder Traversal: ");
        bt.traversePreorder(bt.root);
        System.out.println("");
        System.out.print("inOrder Traversal: ");
        bt.traverseInorder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Traversal: ");
        bt.traversePostorder(bt.root);
        System.out.println("");
        System.out.println("Find Node: " + bt.find(5));
        System.out.println("Delete Node 8");
        bt.delete(8);
        System.out.println("");
        System.out.print("PreOrder Traversal: ");
        bt.traversePreorder(bt.root);
        System.out.println("");
    }
}
