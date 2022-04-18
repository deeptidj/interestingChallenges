/**
 * Created by deepti on 2/7/18.
 */
public class Array3Stacks {
    //Describe how you could use a single array to implement three stacks
    // [ 1, 2, ..30 ] => implement 3 stacks
    //
    int stackSize = 3;
    int[] tops ={0,0,0};
    int arrSize= stackSize * 3;
    int[] arr = new int[arrSize];
    void push(int stackNum, int value) {
        int index = (stackNum * stackSize) + tops[stackNum];
        if (index >= arr.length) {
            System.out.println("Stack is full");
            return;
        }
        System.out.println("Pushing at " +index);
        tops[stackNum]++;
        arr[index] = value;
    }

    int pop(int stackNum) {
        int index = (stackNum * stackSize) + tops[stackNum];
        if (index <= 0 || index >= arr.length) {
            System.out.println("Stack is empty");
            return -1;
        }
        tops[stackNum]--;
        int value = arr[index];
        System.out.println("Pushing at " +value);
        arr[index] = 0;
        return value;
    }

    void print3Stack() {
        for(int a : arr) {
            System.out.println(" data : "+a);
        }
    }
    public static void main(String args[]) {
        System.out.println(" An array as three stacks ");
        Array3Stacks a = new Array3Stacks();
        a.push(0,10);
        for (int i = 0; i < 10; i++) {
            a.push(0,10*i);
        }

        a.push(1,10);
        a.push(2,10);
        a.push(0,20);
        a.push(1,20);
        a.push(2,20);
        a.push(0,30);
        a.push(1,30);
        a.push(2,30);

        a.push(0,40);
        a.push(1,40);
        a.push(2,40);
        a.print3Stack();

        for (int i = 0; i < 10; i++) {
            a.pop(0);
        }
        a.print3Stack();

    }

}
