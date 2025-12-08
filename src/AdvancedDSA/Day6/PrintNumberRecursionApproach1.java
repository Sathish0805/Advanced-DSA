package AdvancedDSA.Day6;

public class PrintNumberRecursionApproach1 {
    public static void main(String[] args) {
        int A = 10;
        inc(A);
    }
    static void inc(int n){
        if (n==0){
            return;
        }
        if(n==1){
            System.out.print(1+ " ");
            return;
        }
        inc(n-1);
        System.out.print(n + " ");
    }
}
