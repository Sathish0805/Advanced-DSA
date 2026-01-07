package AdvancedDSA1.Day8;

import java.util.Arrays;

public class PairSumDivisibleByMApproach2 {
    public static void main(String[] args) {
        int[] A = {2, 3,4,8,6,15,5,12,17,7,18,10,9,16,21};
        int B = 6;

        long[] freq = new long[B];
//        Arrays.fill(freq, 0);
        long MOD = 1000000007;
        for (int j : A) {
            int value = j % B;
            freq[value]++;
        }
        System.out.println(Arrays.toString(freq));
        long ans = 0;
        ans += (freq[0] * (freq[0]-1) /2) % MOD;

        if(B%2==0){
            ans += (freq[B/2] * (freq[B/2]-1) /2) % MOD;
        }

        int l = 1, r = B-1;
        while (l < r){
            ans += (freq[l] * freq[r]) % MOD;
            l++;
            r--;
        }
        System.out.println((int)ans);
    }
}
