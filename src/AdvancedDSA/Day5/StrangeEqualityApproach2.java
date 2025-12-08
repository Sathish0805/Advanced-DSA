package AdvancedDSA.Day5;

public class StrangeEqualityApproach2 {
    public static void main(String[] args) {
        int A = 5;

        int Y = 1;
        while(Y <= A){
            Y *= 2;
        }

        int X = (~A) & (Y - 1)   ;
        System.out.println(X ^ Y);
    }
}
