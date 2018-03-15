/**
 * Created by deepti on 2/6/18.
 */
public class MyStack {
    private int size;
    private int top=-1;
    private int arr[];

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int d) {

        ++top;
        if(top < size) {
            arr[top] = d;

            System.out.println("Pushed" + d);
        }
        else System.out.println("Stack is full");

    }

    public int pop() {
        top--;
        if(top > 0)
        {
            int d = arr[top];
            System.out.println("Poping" + d);
            return d;
        }
        else {
         System.out.println("Stack is empty");
         return 0;
        }
    }
}
