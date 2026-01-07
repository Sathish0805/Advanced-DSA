package AdvancedDSA1.Day8;

public class GreatestCommonDivisorApproach1 {
    public static void main(String[] args) {
        int A = 7;
        int B = 6;
        System.out.println(gcd(A,B));
    }
    static int gcd(int A, int B) {
        if(A==0) return B;
        if(A >= B) return gcd(A%B,B);
        return gcd(B, A);
    }
}
