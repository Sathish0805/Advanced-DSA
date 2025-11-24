package AdvancedDSA.Day2;

public class SearchKinMatrixApproach1 {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int B = 2;
        boolean flag = false;
        for (int i = 0; i < A.length; i++) {
            for(int j = 0; j<A[i].length; j++) {
                if(A[i][j]==B){
                    flag  = true;
                    break;
                }
            }
        }
        System.out.print(flag);
    }
}
