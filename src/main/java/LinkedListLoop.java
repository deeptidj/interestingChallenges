/**
 * Created by deepti on 2/6/18.
 */
public class LinkedListLoop {
    public static void main (String args[]) {
        System.out.println("Loop Detection");

        Node n = create123();
     //   MainClass.printNode(n);
       Node k = meetingPoint(n);
        System.out.println("Meeting point" +k.data);


        Node b = findBeginning(n);
        if (b!= null)
        {System.out.println("Meeting data" +k.data);}


    }
    public static Node findBeginning(Node n){
        System.out.println("Find beginning");
        Node n1 = n, n2 = n;
        while (n2.next != null) {
            n1 = n1.next;
            n2 = n2.next.next;
            if (n1 == n2) break;
        }
        System.out.println("Meeting point" +n1.data);
        if (n2.next == null){
            return null;
        }
        System.out.println("Meeting point" +n2.data);
        n1 = n;
        while (n1 != n2) {
            n1 = n1.next;
            n2 = n2.next;
        }

        return n2;
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
        n6.next = n4;
        n7.next = n8;

        return n1;
    }
    public static Node meetingPoint(Node n) {
        Node n1 = n, n2 = n;

        System.out.println("Finding meeting point");
        while (n2.next != null) {
            n1 = n1.next;
            n2 = n2.next.next;
            if (n1 == n2) break;
        }
        return n1;
    }
}
