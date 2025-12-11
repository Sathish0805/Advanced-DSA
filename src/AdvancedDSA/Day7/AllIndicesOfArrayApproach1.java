package AdvancedDSA.Day7;

import java.util.Arrays;

public class AllIndicesOfArrayApproach1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1};
        int B = 1;
        System.out.println(Arrays.toString(returnIndexes(arr, B, arr.length,0, 0)));
    }
    static int[] returnIndexes(int[] arr, int B, int n, int i, int count) {
        if(i == n) return new int[count];
        if(arr[i] == B){
            int[] A = returnIndexes(arr, B, n, i+1, count+1);
            A[count] =  i;
            return A;
        } else {
            return returnIndexes(arr, B, n, i+1, count);
        }
    }
}
