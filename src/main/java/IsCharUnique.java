import java.util.Scanner;

/**
 * Created by deepti on 1/16/18.
 */
public class IsCharUnique {
    public static void main(String args[]) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a string to test the uniqueness of the characters");
//        String input = scan.next();
//        if (isCharUnique(input))
//            System.out.println("Yes, all are unique characters");
//        else
//            System.out.println("No, all are not unique characters");
//
//
//        System.out.println("Reverse a String");
//        String t = reverse(input);
//        System.out.print(t);

//        int[] arr = {4,1,3};
//        boolean res = isPermutation(arr);
//        System.out.println("Given array is permutation - "+res);


        int[] arr1 ={3,4,4,6,1,4,4};
        int n = 5;
        int[] res1 = maxCounters(n,arr1);
        System.out.println("End: ");
        for (int i = 0; i < res1.length; i++) {
            System.out.print(res1[i]);
        }

    }
    public static int[] maxCounters(int N, int[] A) {
        //int max =0;
        int[] counters = new int[N];
        for(int i =0; i< N; i++) {
            counters[i] = 0;
        }
        for (int i = 0; i < A.length ; i++) {
            if(A[i] >= 1 && A[i] <= N) {
                counters[A[i]-1] = counters[A[i]-1] + 1;
                //max++;
            }
            else if (A[i] == N+1) {
                int max = 0;
                for (int j = 0; j < counters.length; j++) {
                    if(counters[j] > max) max = counters[j];
                }
                for (int j = 0; j < counters.length; j++) {
                    counters[j] = max;
                }
            }
        }
        return counters;
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

    public static boolean isPermutation(int[] arr) {
        int expSum = (arr.length * (arr.length +1))/2;
        System.out.println("Expected Sum: "+expSum);
        int sum = 0 ;
        for(int i = 0 ; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum : "+sum);
        if (sum != expSum) {
            System.out.println("no!");
            return false;
        } else return true;
    }

    public static int[] increase(int X, int[] ctrs){
        System.out.println();
        System.out.println("Before increase");
        System.out.println();
        for (int i = 0; i < ctrs.length; i++) {
            System.out.print(ctrs[i]);
        }

        ctrs[X-1] = ctrs[X-1] + 1;
        System.out.println();
        System.out.println("After increase: ");
        System.out.println();
        for (int i = 0; i < ctrs.length; i++) {
            System.out.print(ctrs[i]);
        }
        return ctrs;
    }
    public static int[] maxCounter(int[] ctrs){
        int max = 0;
        for (int i = 0; i < ctrs.length; i++) {
            if(ctrs[i] > max) max = ctrs[i];
        }
        for (int i = 0; i < ctrs.length; i++) {
            ctrs[i] = max;
        }
        System.out.println("Max Counters ");
        for (int i = 0; i < ctrs.length; i++) {
            System.out.println(ctrs[i]);
        }
        return ctrs;
    }
}
