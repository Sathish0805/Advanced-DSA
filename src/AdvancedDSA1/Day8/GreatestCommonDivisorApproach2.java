package AdvancedDSA1.Day8;
// this is applicable only when the A >= B

public class GreatestCommonDivisorApproach2 {
    public static void main(String[] args) {
        int A = 7;
        int B = 6;
        System.out.println(gcd(A,B));
    }
    static int gcd(int A, int B) {
        if(B==0) return A;
        return gcd(B, B%A);
    }
}
