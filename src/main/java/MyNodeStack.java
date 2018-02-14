/**
 * Created by deepti on 2/7/18.
 */
public class MyNodeStack {
    MyNode top;
    Object pop() {
        if (top != null) {
            Object item = top.data;
            top = top.next;
            return item;
        }
        return null;
    }
    void push(Object item) {
        MyNode t = new MyNode(item);
        t.next = top;
        top = t;
    }
}
