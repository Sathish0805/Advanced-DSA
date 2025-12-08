package AdvancedDSA.Day5;

import java.util.Arrays;

public class MinimumXORPairApproach2 {
    public static void main(String[] args) {
        int[] arr = {15,5,1,10,2};
        Arrays.sort(arr);
        int ans = Integer.MAX_VALUE;
        int i = 0;
        while (i < arr.length-1) {
            ans = Math.min(ans, arr[i] ^ arr[i + 1]);
            i++;
        }
        System.out.println(ans);
    }
}
