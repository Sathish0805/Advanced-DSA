package AdvancedDSA.Day6;

public class SumOfDigits {
    public static void main(String[] args) {
        int A = 4159;
        System.out.print(sum(A));
    }
    static int sum(int A){
        if(A <= 0) return 0;
        return (A%10) + sum(A/=10);
    }
}
