package AdvancedDSA.Day5;

public class NumberOf1BitsApproach3 {
    public static void main(String[] args) {
        int A = 11;
        int count = 0;

        for (int i = 0; i < 32; i++) {
            if(A == 0) break;
            if((A & 1) == 1) count++;
            A = A >> 1;
        }
        System.out.println(count);
    }
}
