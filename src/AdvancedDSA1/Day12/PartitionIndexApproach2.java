package AdvancedDSA1.Day12;

// partition index is n-1 th index

import java.util.Arrays;

public class PartitionIndexApproach2 {
    public static void main(String[] args) {
        int[] arr = {6, 2, 0, 4, 5};
        int p = arr[arr.length-1];
        int left = 0;
        int right = arr.length - 2;

        while (left <= right) {
            if(arr[left] < p){
                left++;
            }else  if(arr[right] > p){
                right--;
            }else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        int temp = arr[arr.length-1];
        arr[arr.length-1] = arr[left];
        arr[left] = temp;
        System.out.println(Arrays.toString(arr));
        System.out.println(left);
    }
}
