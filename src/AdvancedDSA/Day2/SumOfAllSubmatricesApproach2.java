package AdvancedDSA.Day2;

public class SumOfAllSubmatricesApproach2 {
    public static void main(String[] args) {
        int[][] arr = {{1, 1}, {1, 1}};
        int n = arr.length;
        int m = arr[0].length;

        int ans = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                ans +=  arr[i][j] * (i+1) *  (j+1) * (n-i) * (m-j);
            }
        }
        System.out.println(ans);
    }
}
