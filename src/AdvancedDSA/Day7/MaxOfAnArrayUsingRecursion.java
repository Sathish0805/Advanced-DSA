package AdvancedDSA.Day7;

public class MaxOfAnArrayUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {12, 10, 3, 4, 5};
        System.out.println(checkMax(arr, 0, Integer.MIN_VALUE));
    }
    static int checkMax(int[] arr, int i, int max){
        if(i == arr.length) return max;
        max = Math.max(max, arr[i]);
        return checkMax(arr, i + 1, max);
    }
}
