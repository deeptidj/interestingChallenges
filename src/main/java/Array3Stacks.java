/**
 * Created by deepti on 2/7/18.
 */
public class Array3Stacks {
    //Describe how you could use a single array to implement three stacks
    int stackSize = 10;
    int[] arr = new int[stackSize *3];

    int[] tops ={0,0,0};

    void push(int stackNum, int value) {
        int index = stackNum * (stackSize) + tops[stackNum];
        System.out.println("Pushing at " +index);
        tops[stackNum]++;
        arr[index] = value;
    }

    int pop(int stackNum) {
        int index = stackNum * (stackSize) + tops[stackNum];
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
        a.push(1,10);
        a.push(2,10);
        a.push(0,20);
        a.push(1,20);
        a.push(2,20);
        a.push(0,30);
        a.push(1,30);
        a.push(2,30);
        a.print3Stack();

    }

}
