package AdvancedDSA1.BreakPracticeSession;

import AdvancedDSA1.Day2.FirstMissingIntegerApproach3;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 5, 4, 1};
        int n =  arr.length;

        int index1 = 0;
        int index2 = 0;

        for (int i = n - 2; i >= 0; i--) {
            if(arr[i] < arr[i+1]){
                index1 = i;
                break;
            }
        }
        for (int i = n - 1; i >= index1; i--) {
            if(arr[index1] > arr[i]){
                index2 = i;
                break;
            }
        }
        FirstMissingIntegerApproach3.swap(arr, index2, index1);

        int left = index1 + 1;
        int right = n - 1;
        while (left < right) {
            FirstMissingIntegerApproach3.swap(arr, left, right);
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
