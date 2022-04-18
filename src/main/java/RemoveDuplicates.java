import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by deepti on 1/16/18.
 */
public class RemoveDuplicates {
    public static void main(String args[]) {
        //System.out.print(removeDupsWithoutBuffers("abcdaef"));
        //System.out.println(removeDuplicatesWithOutBuffers("abcd"));
        removingDuplicatesUsingStreams(new Integer[] {1,2,3,4,5,6,3,3,4});
        removingDuplicatesUsingLinkedHashSet(new Integer[] {1,2,3,4,5,6,3,3,4});
    }

    public static String removeDuplicatesWithOutBuffers(String str) {
        char[] arr = str.toCharArray();
//        if (str.length() <= 2) {
//            System.out.println("Length less than 2");
//        }
        
        int tail = 1;

        for (int i = 1; i < arr.length; i++) {
            int j;
            for (j = 0; j < tail; j++) {
                if (arr[j] == arr[i]) {
                    break;
                }
            }
            arr[j] = arr[i];
            System.out.println("Value of i = "+i);
            System.out.println("Value of j = "+j);
        }



        return "";
    }
    public static String removeDupsWithoutBuffers(String str) {
        char[] arr = str.toCharArray(); int tail = 1;
        int len = arr.length;
        if (len < 2) return "";
        System.out.println("Length" + len);

        for (int i = 1; i < arr.length; i++) {
            int j;
            for (j = 0; j < tail; j++) {
                if (arr[i] == arr[j]) break;
            }
            if (j == tail) {
                arr[tail] = arr[i];
                tail++;
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <= tail; i++) {
            sb.append(arr[i]);
        }

        for (char c : arr) {
            System.out.println(c);
        }
        System.out.println();

        System.out.println(String.valueOf(arr));

        //return String.valueOf(String.valueOf(arr));
        return sb.toString();

    }

    public static void removingDuplicatesUsingStreams(Integer[] arr) {
        System.out.println("Array with all numbers");
        for (Integer i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        List<Integer> listWithOutDupls = Arrays.asList(arr).stream().distinct().collect(Collectors.toList());
        System.out.println(" Array with out dupls");
        for (Integer i : listWithOutDupls) {
            System.out.print(i+" ");
        }
    }

    public static void printArray(Integer[] arr) {
        System.out.println(" Array ");
        for (Integer i : arr) {
            System.out.print(i+" ");
        }
    }

    public static Integer[] removingDuplicatesUsingLinkedHashSet(Integer[] arr) {

        printArray(arr);

        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));

        Integer[] listWithOutDups = set.toArray(new Integer[]{});
        printArray(listWithOutDups);

        return listWithOutDups;
    }

}
