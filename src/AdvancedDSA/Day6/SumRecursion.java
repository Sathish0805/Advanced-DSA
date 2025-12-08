package AdvancedDSA.Day6;

public class SumRecursion {
    public static void main(String[] args) {
        int A = 4;
        System.out.println(sum(A));
    }
    static int sum(int n){
        if(n==0) return 0;
        return n+sum(n-1);
    }
}
