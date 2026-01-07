package AdvancedDSA1.Day10;

import java.util.Arrays;
import java.util.HashSet;

public class DistinctNumbersInWindowApproach1 {
    public static void main(String[] args) {
        int[]  A = {1, 2, 1, 3, 4, 3};
        int B = 3;
        int[] ans = new  int[A.length-B+1];
        int i = 0;
        int j = B-1;
        while (j < A.length) {
            System.out.println(j);
            HashSet<Integer> set = new HashSet<>();
            for (int k = i; k <= j; k++) {
                set.add(A[k]);
            }
            System.out.println(set);
            ans[i] =  set.size();
            i++;
            j++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
