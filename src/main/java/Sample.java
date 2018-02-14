import java.util.Scanner;

/**
 * Created by deepti on 1/16/18.
 */
public class Sample {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string to test the uniqueness of the characters");
        String input = scan.next();
        if (isCharUnique(input))
            System.out.println("Yes, all are unique characters");
        else
            System.out.println("No, all are not unique characters");


        System.out.println("Reverse a String");
        String t = reverse(input);
        System.out.print(t);


    }



    public static boolean isCharUnique(String str) {
        System.out.println(str);
        System.out.println("----");

        boolean[] char_set = new boolean[256];

        for(int i =0; i < str.length();i++) {
            int val = str.charAt(i);
            if (char_set[val]) return false;
            else char_set[val] = true;

        }
        return true;

    }



    public static String reverse(String str) {

        char[] arr =  str.toCharArray();
        int start = 0;
        int end = str.length()-1;

            while (start < end) {
                char tmp = arr[end];
                arr[end] = arr[start];
                arr[start] = tmp;
                end--; start++;
            }
        return String.valueOf(arr);

    }
}
