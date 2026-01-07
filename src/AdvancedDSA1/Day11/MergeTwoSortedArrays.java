package AdvancedDSA1.Day11;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] A = {4, 7, 9};
        int[] B = {2, 11, 19};

        int n  = A.length;
        int m  = B.length;

        int[] ans = new int[n + m];
        int i = 0, j = 0, index = 0;
        while (i < n && j < m) {
            if (A[i] < B[j]) {
                ans[index] = A[i];
                i++; index++;
            }else{
                ans[index] = B[j];
                j++; index++;
            }
        }
        while (i < n) ans[index++] = A[i];
        while (j < m) ans[index++] = B[j++];

        System.out.println(Arrays.toString(ans));

    }
}
