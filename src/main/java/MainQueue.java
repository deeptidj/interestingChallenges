/**
 * Created by deepti on 2/7/18.
 */
public class MainQueue {
    public static void main(String args[]) {
        System.out.println("Main class for Queue");
        MyQueue q = new MyQueue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println("Main class for Queue");
    }
}
