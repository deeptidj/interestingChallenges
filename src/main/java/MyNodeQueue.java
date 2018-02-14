/**
 * Created by deepti on 2/7/18.
 */
public class MyNodeQueue {
    MyNode first = null, last = null;

    public MyNodeQueue(){
        first = null;
        last = null;
    }

    Object dequeue() {
        if (last != null && first != null) {
            Object item = first.data;
            System.out.println("removing from queue " +first.data);
            first = first.next;
            return item;
        }
        else {
            System.out.println("Empty Queue!");
            return null;
        }
    }
    void enqueue(Object item) {
        MyNode t = new MyNode(item);
        t.data = item;
        if (last != null) {
            last.next = t;

        }
       else {
            first = t;
        }
        last = t;
        System.out.println("added to queue " +last.data);
    }
}
