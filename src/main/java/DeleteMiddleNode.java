import sun.applet.Main;

/**
 * Created by deepti on 1/31/18.
 */
public class DeleteMiddleNode {
    public static void main(String args[]) {
        System.out.println("Main class calling");
        Node root =  MainClass.create123();
        MainClass.printNode(root);

        System.out.println("Size = " +sizeList(root));

    }
    public static Node findMiddle(Node root) {
        return null;
    }
    public static int sizeList(Node root) {
        int size=0;
        Node curr = root;
        while(curr != null) {
            size++;
            curr = curr.next;
        }
        return size;
    }
}
