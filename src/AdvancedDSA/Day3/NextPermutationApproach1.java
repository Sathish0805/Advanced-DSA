package AdvancedDSA.Day3;

import java.util.Arrays;

public class NextPermutationApproach1 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,6,5,4,1};
        int[] arr = {3,6,5,9,6,2,7};

        int index1 = 0, index2 = 0;
        for(int i = arr.length-2; i>=0; i--){
            if(arr[i] < arr[i+1]){
                index1 = i;
                break;
            }
        }
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i] > arr[index1]){
                index2 = i;
                break;
            }
        }
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        int left = index1+1,  right = arr.length-1;
        while(left<right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));

    }
}
