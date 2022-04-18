import java.util.ArrayList;

/**
 * Created by deepti on 2/7/18.
 */
public class Array3StacksGrow {
    //Describe how you could use a single array to implement three stacks
    int stackSize = 10;
    ArrayList<Integer> arrayList = new ArrayList<>(stackSize*3);
    int[] arr = new int[stackSize *3];

    int[] tops ={0,0,0};

    void push(int stackNum, int value) {
        int index = (stackNum * stackSize) + tops[stackNum];
        System.out.println("Pushing at " +index);
        tops[stackNum]++;
        arrayList.add(value);
    }

    int pop(int stackNum) {
        int index = (stackNum * stackSize) + tops[stackNum];
        if (arrayList.isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        tops[stackNum]--;
        int value = arrayList.get(index);
        System.out.println("Popping " +value);
        return value;
    }
    void print3Stack() {
        for(int a : arrayList) {
            System.out.println(" data : "+a);
        }
    }
    public static void main(String args[]) {
        System.out.println(" An array as three stacks ");
        Array3StacksGrow a = new Array3StacksGrow();
        a.push(0,10);

        a.print3Stack();

        for (int i = 0; i < 20; i++) {
            a.push(0, i);
        }

        for (int i = 0; i < 20; i++) {
            a.pop(0);
        }
        a.print3Stack();

    }

}
