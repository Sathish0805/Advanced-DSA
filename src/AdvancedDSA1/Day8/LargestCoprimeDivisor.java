package AdvancedDSA1.Day8;

public class LargestCoprimeDivisor {

    public static void main(String[] args) {
        int A = 30;
        int B = 12;

        int X = A;

        while (true) {
            int g = gcd(X, B);
            if (g == 1) {
                break;
            }
            X = X / g;
        }

        System.out.println(X);
    }

    static int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b, a%b);
    }
}
