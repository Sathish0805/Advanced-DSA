package AdvancedDSA.Day1;

import java.util.Arrays;

public class ContinuousSumQueryApproach3 {
    public static void main(String[] args) {
        int N = 7;
        int[][] queries = {{1,3,2},{2,5,3},{5,6,-1}};

        int[] arr = new int[N];

        for(int[] query : queries){
            int i = query[0];
            int j = query[1];
            int value = query[2];
            arr[i] += value;
            if(j+1 < N){
                arr[j+1] += -value;
            }
        }

        for(int i = 1; i < N; i++){
            arr[i] = arr[i] + arr[i-1];
        }

        System.out.println(Arrays.toString(arr));
    }
}
