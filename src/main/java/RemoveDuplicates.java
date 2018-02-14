/**
 * Created by deepti on 1/16/18.
 */
public class RemoveDuplicates {
    public static void main(String args[]) {
        System.out.print(removeDupsWithoutBuffers("abcdaefbgh"));

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

        for (char c : arr) {
            System.out.println(c);
        }
        System.out.println();

        System.out.println(String.valueOf(arr));

        return String.valueOf(String.valueOf(arr));
    }
}
