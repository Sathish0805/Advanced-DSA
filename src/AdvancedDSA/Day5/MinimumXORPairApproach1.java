package AdvancedDSA.Day5;

public class MinimumXORPairApproach1 {
    public static void main(String[] args) {
        int[] arr = {0, 4, 7, 9};
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                ans = Math.min(ans, arr[i] ^ arr[j]);
            }
        }

        System.out.println(ans);
    }

}
