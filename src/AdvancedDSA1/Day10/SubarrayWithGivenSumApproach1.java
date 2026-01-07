package AdvancedDSA1.Day10;

import java.util.Arrays;

public class SubarrayWithGivenSumApproach1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int num = 5;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += arr[k];
                }
                if(sum == num){
                    System.out.println(i + "," + j);
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,1,3)));
    }
}
