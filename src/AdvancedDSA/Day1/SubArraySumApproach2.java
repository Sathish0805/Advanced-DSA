package AdvancedDSA.Day1;

/*
 Question:
 Given an integer array, find the maximum subarray sum.
 - A subarray is a contiguous part of the array.

 Approach 2 (Prefix Sum - O(n²)):
 - First create a prefix sum array where:
      pf[i] = sum of elements from index 0 to i.
 - Using prefix sum, any subarray sum from i to j can be found in O(1) using:
      sum = pf[j] - pf[i-1]
   (If i = 0, then sum = pf[j])
 - Check all (i, j) pairs and track the maximum sum.
*/

public class SubArraySumApproach2 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 1, 6};
//        int[] arr = {-4, -3, -6, -9, -2};

        int[] pf =  new int[arr.length];
        pf[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pf[i] = pf[i - 1] + arr[i];
        }

        int ans = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                if(i == 0){
                    sum = pf[j];
                }else {
                    sum = pf[j] - pf[i-1];
                }
                ans = Math.max(ans,sum);
            }
        }
        System.out.println(ans);
    }
}
