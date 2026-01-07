package AdvancedDSA1.Day8;

public class DivisorGameApproach1 {
    public static void main(String[] args) {
        int A = 12;
        int B = 3;
        int C = 2;

        int count=0;

        for( int i = 1; i <= A; i++ ){
            if(i % B == 0 && i % C == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
