package AdvancedDSA1.BreakPracticeSession;

public class SearchElementInMatrixApproach2 {
    public static void main(String[] args) {
        int[][] A = {{2, 8, 8, 8}, {2, 8, 8, 8}, {2, 8, 8, 8}};
        int B = 8;

        int i = 0, j = A[0].length-1;
        int ans = -1;

        while (i < A.length && j >= 0) {
            int val = A[i][j];
            if (val == B) {
                int result = (i+1) * 1009 + (j+1);
                if (ans == -1 || result < ans) {
                    ans = result;
                }
                j--;
            } else if (B < val) {
                j--;
            } else{
                i++;
            }
        }

        System.out.println(ans);
    }
}
