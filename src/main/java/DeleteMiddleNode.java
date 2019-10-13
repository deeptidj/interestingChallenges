

/**
 * Created by deepti on 1/31/18.
 */
public class DeleteMiddleNode {
    public static void main(String args[]) {
        System.out.println("Main class calling");
        Node root =  MainClass.create123();
        MainClass.printNode(root);

        System.out.println("Size = " +sizeList(root));
        findMiddle(root);
    }
    public static Node findMiddle(Node root) {
        Node curr = root;
        int size = sizeList(root);
        System.out.println("Size = " +sizeList(root));
        int mid = size%2==0?size/2:size/2 +1;
        System.out.println("Middle : "+mid);
        while(curr.next != null){

            curr = curr.next ;
        }
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
