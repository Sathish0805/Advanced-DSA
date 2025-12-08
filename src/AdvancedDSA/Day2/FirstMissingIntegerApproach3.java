package AdvancedDSA.Day2;

import java.util.Arrays;

public class FirstMissingIntegerApproach3 {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1, 2, 3, 4};

        int i = 0;
        while(i<arr.length){
            if(arr[i] >= 1 && arr[i] <= arr.length && arr[i] != arr[arr[i]-1]){
                swap(arr, i , arr[i] - 1);
            }else{
                i++;
            }
        }

        for(int j=0;j<arr.length;j++){
            if(arr[j] != j+1){
                System.out.println(j+1);
                break;
            }
        }
    }

    public static void swap(int[] arr, int source, int target){
        int temp = arr[source];
        arr[source] = arr[target];
        arr[target] = temp;
    }
}
