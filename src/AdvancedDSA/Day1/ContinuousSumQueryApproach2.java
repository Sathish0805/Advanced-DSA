package AdvancedDSA.Day1;

import java.util.Arrays;

public class ContinuousSumQueryApproach2 {
    public static void main(String[] args) {
        int N = 5;
        int[][] queries = {{1,3},{0,2},{4,1}};

        int[] arr = new int[N];

        for(int[] query : queries){
            int  index = query[0];
            int value = query[1];
            arr[index] += value;
        }

        for (int i = 1; i < arr.length; i++){
            arr[i] += arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
