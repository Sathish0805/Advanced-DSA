package AdvancedDSA1.Day8;

public class ImplementPowerFunction {
    public static void main(String[] args) {
        int A = -1;
        int B = 2;
        int C = 20;
        long ans = power(A,B,C);
        System.out.println((int)(ans % C + C) % C);
    }
    static long power(long a, long b, long C) {
        if (b == 0) return 1;

        long half = power(a, b / 2, C);
        half = (half * half) % C;

        if (b % 2 == 1)
            half = (half * a) % C;

        return half;
    }
}
