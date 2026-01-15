package AdvancedDSA2.Day3;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] A = {1, 4, 3};
        int[] B = {2, 6, 7};

        int n = A.length;
        int m = B.length;

        int[] ans = new int[n + m];

        int i = 0, j = 0, index = 0;

        while (i < n && j < m) {
            if (A[i] <= B[j]) {
                ans[index++] = A[i++];
            } else {
                ans[index++] = B[j++];
            }
        }

        while (i < n) {
            ans[index++] = A[i++];
        }

        while (j < m) {
            ans[index++] = B[j++];
        }

        if (ans.length % 2 == 1) {
            System.out.println(ans[ans.length / 2]);
        }else {
            System.out.println((double) (ans[(ans.length / 2)-1] + ans[ans.length / 2])/2);
        }

        System.out.println(Arrays.toString(ans));
    }
}
