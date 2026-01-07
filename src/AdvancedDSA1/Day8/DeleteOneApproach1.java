package AdvancedDSA1.Day8;

public class DeleteOneApproach1 {
    public static void main(String[] args) {
        int[] arr = {12, 15, 18};

        int max = Integer.MIN_VALUE;
        for( int i = 0; i < arr.length; i++ ) {
            for( int j = i+1; j < arr.length; j++ ) {
                max = Math.max(max, gcd(arr[i], arr[j]));
            }
        }
        System.out.println(max);
    }
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
