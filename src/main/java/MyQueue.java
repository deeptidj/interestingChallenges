/**
 * Created by deepti on 2/7/18.
 */
public class MyQueue {
    private int[] queue;
    private int first = -1;
    private int last = -1;
    private int size;
    public MyQueue(int size) {
        this.size = size;
        queue = new int[size];

    }
    void enqueue(int d) {
        last++;
        if (last < size) {
            queue[last] = d;
            System.out.println("Added to Queue" + queue[last]);
        }
        else System.out.println("Full Queue");
    }
    int dequeue() {
        first++;
        if (first > -1 && first != last) {
            System.out.println("Popping from Queue"+ queue[first]);
            return queue[first];
        }
        else System.out.println("Empty Queue");
        return 0;
    }
}
