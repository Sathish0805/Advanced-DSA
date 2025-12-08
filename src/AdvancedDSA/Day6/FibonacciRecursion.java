package AdvancedDSA.Day6;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int A =9;
        System.out.println(fib(A));
    }
    static int fib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }
}
