import java.util.HashMap;
import java.util.Map;

/**
 * Created by deepti on 9/20/19.
 */
public class OddOccurencesInArray {
    public static void main(String[] args) {

        System.out.print("Odd occurrences in Array");
        oddOcc();
        frqInArray();
    }

    public static void frqInArray() {
        int[] arr = {1,2,2,3,3,3,4,4,4,4};
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>(10);
        for (int i = 0; i < arr.length; i++) {
            if(h.containsKey(arr[i])) {
                h.put(arr[i],h.get(arr[i])+1);
            } else h.put(arr[i],1);
        }
        System.out.println(h);

//        for (int i = 0; i < arr.length; i++) {
//            if(h.containsKey(arr[i])) {
//                h.put(arr[i], h.getOrDefault(arr[i], 1) + 1);
//            }
//        }
        System.out.println(h);

    }

    public static int oddOcc(){
        int[] arr= {4,5,6,4,5};
        HashMap<Integer, Boolean> h = new HashMap<Integer, Boolean>(5);
        for (int i = 0; i < arr.length; i++) {
            if(h.containsKey(arr[i])) {
                h.put(arr[i], true);
            }
            else h.put(arr[i], false);

        }
       for(Map.Entry m : h.entrySet()) {
           //System.out.println(m.getKey());
           //System.out.println(m.getValue());

           if(!(Boolean)m.getValue()) System.out.println(m.getKey());
       }
        System.out.println(h);
        return 0;
    }
}
