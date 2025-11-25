package AdvancedDSA.Day2;

public class SearchKinMatrixApproach2 {
    public static void main(String[] args) {
//        int[][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
//        int B = 2;

        int[][] A = {{2,8,8,8},{2,8,8,8},{2,8,8,8}};
        int B = 8;

        int ans = Integer.MAX_VALUE;

        int i=0, j= A[0].length-1;
        while(i<A.length && j>= 0){
            if(A[i][j]==B){
                System.out.println(i + " " + j);
                ans = Math.min(ans , ((i + 1) * 1009 + (j + 1)));
                j--;
            } else if (A[i][j] > B) {
                j--;
            }else{
                i++;
            }
        }
        System.out.println(ans);
    }
}
