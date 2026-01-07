package AdvancedDSA1.Day8;

public class DivisorGameApproach2 {
    public static void main(String[] args) {
        int A = 12;
        int B = 3;
        int C = 2;

        int value = lcm(B,C);
        System.out.println(A/value);
    }
    static int gcd(int A, int B) {
        if(B == 0) return A;
        return gcd(B, A%B);
    }

    static int lcm(int A, int B) {
        return A*B/gcd(A,B);
    }
}
