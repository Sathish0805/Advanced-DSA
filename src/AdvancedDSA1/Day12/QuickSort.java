package AdvancedDSA1.Day12;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {-58,32,10,42,82,-12,88,17,35,8,-72,-32,-48,76,-48,-8,-69,-1,54,52,37,-1,95,0,-32,38,62,68,68,-71,62,-58,-25,55,-11,2};
        int  n = arr.length;
        quickSort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int pivot = partition(arr, left, right);
        quickSort(arr, left, pivot - 1);
        quickSort(arr, pivot + 1, right);
    }
    static int partition(int[] arr, int left, int right) {
        int p = arr[left];
        int l =  left + 1;
        int r = right;
        while (l <= r) {
            if(arr[l] <= p) {
                l++;
            }else if(arr[r] > p) {
                r--;
            }else{
                int temp = arr[r];
                arr[r] = arr[l];
                arr[l] = temp;
            }
        }
        int temp = arr[left];
        arr[left] = arr[r];
        arr[r] = temp;
        return r;
    }
}
