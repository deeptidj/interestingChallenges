import java.util.Hashtable;

/**
 * Created by deepti on 1/31/18.
 */
public class MainClass {
    public static void main(String args[]) {
        Node n1 = create123();
        Node n2 = create123();
        printNode(n1);
        Node res = add(n1, n2, 0);
        printNode(res);

        System.out.println("Main class calling");
        Node n = create123();
        printNode(n);

        removeDups(n);
        System.out.println("Find 3rd from last ");
        findNthFromEnd(n, 3);

        Node middle = getAccessToMiddle(n);
        System.out.println("Middle data " +middle.data);
        removeMiddle(middle);

        System.out.println("after removing the middle node " +middle.data);
        printNode(n);

    }
    public static boolean removeMiddle(Node mid){
        if (mid == null || mid.next == null) {
            return false; // Failure
        }
        Node nextNode = mid.next;
        mid.data = nextNode.data;
        mid.next = nextNode.next;
        return true;
    }

    public static Node create123(){
        System.out.println("Creating a node of 12345");

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;

        return n1;
    }

public static Node getAccessToMiddle(Node root) {

    Node current = root,curr = root;
    int size = 0;
    while (current != null) {
        size++;
        current = current.next;
    }
    System.out.println("Size : " +size);

    for (int i = 0; i< size/2; i++) {
        curr = curr.next;
        System.out.println(curr.data);
    }
    return curr;
 }

    public static void printNode(Node n) {
        int i = 0;
        while (n != null) {
            System.out.println("List " +i+ "  " +n.data);
            i++;
            n = n.next;
        }

    }

    public static void removeDups(Node n) {
        System.out.println("Removing Dups");
        Node prev = n;
        Hashtable h = new Hashtable();
        Node curr = n;
        while (curr != null) {
            if (h.containsKey(curr.data)) {
                prev.next = curr.next;
            } else {
                h.put(curr.data, true);
            }
            prev = curr;
            curr = curr.next;

        }


    }
    public static Node add(Node n1, Node n2, int carry) {
        System.out.println( "adding 2 nodes");
        if (n1 == null & n2 == null) return null;
        int sum = carry;
        Node result = new Node(0);

        if (n1 != null) {
            sum = sum + n1.data;
        }
        if (n2 != null) {
            sum = sum  + n2.data;
        }

        result.data = sum % 10;

        Node more = add(n1 == null ? null : n1.next, n2 == null ? null :n2.next, sum > 10 ? 1 : 0);

        result.next = more;
        return result;

    }

    public static void findNthFromEnd(Node root, int n) {
        Node p1, p2;
        p1 = root; p2 = root;
        for (int i = 0 ; i < n ; i++) {
            if (p2 == null) return;
            p2 = p2.next;
        }

        while(p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        System.out.println(" P2 is at : " +p2.data);
        System.out.println(" P1 is at : " +p1.data);
    }

}