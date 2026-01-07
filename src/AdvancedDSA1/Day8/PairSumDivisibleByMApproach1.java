package AdvancedDSA1.Day8;

public class PairSumDivisibleByMApproach1 {
    public static void main(String[] args) {
        int[] A = {5, 17, 100, 11};
        int B = 28;

        int count = 0;
        for( int i = 0; i < A.length; i++ ){
            for( int j = i+1 ; j < A.length; j++ ){
                if((A[i]+A[j])%B == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
