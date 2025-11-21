package AdvancedDSA.Day1;

/*
 Question:
 Given an integer array, find the maximum subarray sum.
 - A subarray is a contiguous part of the array.

 Approach 1 (Brute Force - O(n³)):
 - Generate all possible subarrays using two loops (i to j).
 - For each subarray, calculate its sum using an inner loop.
 - Track the maximum sum found.

    Time Complexity - O(n³)
    Space Complexity - O(1)
*/

public class SubArraySumApproach1 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 1, 6};
//        int[] arr = {-4, -3, -6, -9, -2};

        int ans = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum +=  arr[k];
                }
                ans = Math.max(ans,sum);
            }
        }
        System.out.println(ans);
    }
}
