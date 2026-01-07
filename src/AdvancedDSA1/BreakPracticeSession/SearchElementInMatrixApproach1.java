package AdvancedDSA1.BreakPracticeSession;

public class SearchElementInMatrixApproach1 {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int B = 2;
        for ( int i = 0; i < A.length; i++ ) {
            for ( int j = 0; j < A[i].length; j++ ) {
                if ( A[i][j] == B ) {
                    System.out.print((i+1) * 1009 + j+1);
                    break;
                }
            }
        }
        System.out.println(-1);
    }
}
