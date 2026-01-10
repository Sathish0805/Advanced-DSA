package LeetcodeProblems;

import java.util.Arrays;

public class RunningSumArray_1480 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
