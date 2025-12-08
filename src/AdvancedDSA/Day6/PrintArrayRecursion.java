package AdvancedDSA.Day6;

public class PrintArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray(arr, 0, arr.length);
    }
    static void printArray(int[] arr, int i, int n) {
        if (i == n) return;
        System.out.print(arr[i] + " ");
        printArray(arr, i+1, n);
    }
}