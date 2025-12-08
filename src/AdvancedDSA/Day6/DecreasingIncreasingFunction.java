package AdvancedDSA.Day6;

public class DecreasingIncreasingFunction {
    public static void main(String[] args) {
        int N = 1;
        printNum(N);
    }
    static void printNum(int N){
        if(N == 0) return;
        System.out.print(N + " ");
        printNum(N-1);
        System.out.print(N + " ");
    }
}
