package AdvancedDSA.Day2;

import java.util.Arrays;

public class MinimumSwapsApproach1 {
    public static void main(String[] args) {
        int[] A = {2, 1, 5, 6, 3};
        int B = 3;

        int n  = A.length;

        int count = 0;
        for(int i = 0; i < n; i++){
            if(A[i] <= B){
                count++;
            }
        }

        System.out.println(count);

        int bad = 0;
        for(int i = 0; i < count; i++){
            if(A[i] > B){
                bad++;
            }
        }
        System.out.println(bad);
        int ans = bad;
        for(int i = 1, j = count; j < n; i++, j++){
            if(A[i-1] > B) bad--;
            if(A[j] > B) bad++;
            ans  = Math.min(ans, bad);
        }
        System.out.println(ans);
    }
}
