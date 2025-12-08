package AdvancedDSA.Day6;

public class PrintAto1Function {
    public static void main(String[] args) {
        printNum(5);
    }
    static void printNum(int n){
        if(n == 0) return;
        System.out.print(n + " ");
        printNum(n-1);
    }
}
