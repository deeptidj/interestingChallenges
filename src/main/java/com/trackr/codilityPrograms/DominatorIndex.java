package com.trackr.codilityPrograms;

/**
 * Created by deepti on 9/28/19.
 */
public class DominatorIndex {
    public static void main(String[] args) {
        //int[] A = {1,3,4,3,2,3,-1,3,3,4,4,4,4,4,4,4};
        int[] A = {2, 1, 1, 3};
        DominatorIndex d = new DominatorIndex();
        System.out.println(d.solution(A));
    }
    public int solution(int[] A){
        int cand; int dominatorCount  = 0; int dominatorCandidateIndex = -1;
        for (int i = 0; i < A.length; i++) {
            cand = A[i];
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if(cand == A[j]) {count++;}
            }
            if(count > dominatorCount) {
                dominatorCount = count ;
                if (dominatorCount > ((A.length)/2)) dominatorCandidateIndex = i ;

            }
        }
        return dominatorCandidateIndex;
    }
}
