package AdvancedDSA1.Day12;

import java.util.Arrays;
// partition index is 0 th index
public class PartitionIndexApproach1 {
    public static void main(String[] args) {
        int[] arr = {54, 26, 93, 17, 77, 31, 44, 55, 20};
        int p = arr[0];
        int left = 1;
        int right = arr.length - 1;

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

        int temp = arr[0];
        arr[0] = arr[right];
        arr[right] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
