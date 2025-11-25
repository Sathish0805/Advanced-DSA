package AdvancedDSA.Day2;

public class SumOfAllSubmatricesApproach1 {
    public static void main(String[] args) {
        int[][] arr = {{1, 1}, {1, 1}};
        int n = arr.length;
        int m = arr[0].length;

        int totalSum = 0;

        // choose top-left corner (r1, c1)
        for (int r1 = 0; r1 < n; r1++) {
            for (int c1 = 0; c1 < m; c1++) {

                // choose bottom-right corner (r2, c2)
                for (int r2 = r1; r2 < n; r2++) {
                    for (int c2 = c1; c2 < m; c2++) {

                        // sum the submatrix from (r1,c1) to (r2,c2)
                        int sum = 0;
                        for (int i = r1; i <= r2; i++) {
                            for (int j = c1; j <= c2; j++) {
                                sum += arr[i][j];
                            }
                        }

                        totalSum += sum;
                    }
                }
            }
        }

        System.out.println(totalSum);
    }
}
