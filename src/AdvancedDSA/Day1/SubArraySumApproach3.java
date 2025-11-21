package AdvancedDSA.Day1;

/*
 Question:
 Given an integer array, find the maximum subarray sum.
 - A subarray is a contiguous part of the array.

 Approach 3 (Carry Forward / Improved Brute Force - O(n²)):
 - Instead of recalculating subarray sum every time, keep adding the next element.
 - For each starting index i, maintain a running sum 'carry' for subarrays (i...j).
 - Update the maximum sum for each subarray.
 - This removes the innermost loop, improving from O(n³) → O(n²).

    Time Complexity - O(n²)
    Space Complexity - O(1)
*/

public class SubArraySumApproach3 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 1, 6};
//        int[] arr = {-4, -3, -6, -9, -2};

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int carry = 0;
            for (int j = i; j < arr.length; j++) {
                carry += arr[j];
                ans = Math.max(ans, carry);
            }
        }
        System.out.println(ans);
    }
}
