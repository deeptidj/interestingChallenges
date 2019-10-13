import com.trackr.codilityPrograms.leetChallenges.MyStack;

/**
 * Created by deepti on 2/6/18.
 */
public class MainStack {
    public static void main(String args[]) {
        System.out.println("Stack");
        MyStack s = new MyStack(3);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
        s.pop();
        s.pop();
        s.pop();

    }
}
