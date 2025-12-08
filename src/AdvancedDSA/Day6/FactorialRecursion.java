package AdvancedDSA.Day6;

public class FactorialRecursion {
    public static void main(String[] args) {
        int A = 5;
        System.out.println(factorial(A));
    }
    static int factorial(int n){
        if(n == 0)
            return 1;
        else
            return n * factorial(n-1);
    }
}
