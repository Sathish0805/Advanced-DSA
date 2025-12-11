package AdvancedDSA.Day7;

public class FastPowerApproach1 {
    public static void main(String[] args) {
        int A = 2;
        int B = 3;
        if(A == 1) System.out.println(A);
        System.out.println(power(A,B));
    }
    static int power(int A, int B){
        if(B == 0) return 1;
        return A * power(A, B - 1);
    }
}
