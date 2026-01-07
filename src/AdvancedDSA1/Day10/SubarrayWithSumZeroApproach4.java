package AdvancedDSA1.Day10;

import java.util.HashSet;

public class SubarrayWithSumZeroApproach4 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, -3, 4, 3, 1, -2, -3, 2};

        int[] prefixSum = new  int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
            if(prefixSum[i] == 0){
                System.out.println(true);
                return;
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for( int i = 0; i < arr.length; i++ ){
            set.add(arr[i]);
        }
        System.out.println(set.size() != arr.length);
    }
}
