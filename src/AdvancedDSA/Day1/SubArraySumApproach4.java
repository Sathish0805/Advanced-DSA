package AdvancedDSA.Day1;

/*
 Question:
 Given an integer array, find the maximum subarray sum.
 - A subarray is a contiguous part of the array.

 Approach 4 (Kadane's Algorithm - O(n)):
 - Keep a running sum (CurrSum) of the current subarray.
 - If CurrSum becomes negative, reset it to 0 (because negative sum won't help ahead).
 - Track the maximum value of CurrSum at every step.
 - This is the most optimal solution with linear time complexity.

    Time Complexity - O(n)
    Space Complexity - O(n)
*/

public class SubArraySumApproach4 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 1, 6};
//        int[] arr = {-4, -3, -6, -9, -2};

        int maxSum =  Integer.MIN_VALUE;
        int CurrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            CurrSum += arr[i];
            maxSum = Math.max(maxSum, CurrSum);
            CurrSum = Math.max(CurrSum, 0);
        }
        System.out.println(maxSum);
    }
}
