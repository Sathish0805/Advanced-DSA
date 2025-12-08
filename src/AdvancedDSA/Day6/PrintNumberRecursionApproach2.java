package AdvancedDSA.Day6;

public class PrintNumberRecursionApproach2 {
    public static void main(String[] args) {
        int A = 10;
        StringBuilder sb = new StringBuilder();
        printNumber(sb,A);
        System.out.println(sb.toString());
    }
    static void printNumber(StringBuilder sb, int n){
        if(n==1){
            sb.append(1).append(" ");
            return;
        }
        printNumber(sb,n-1);
        sb.append(n).append(" ");
    }
}
