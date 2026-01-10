package AdvancedDSA2.Day1;

public class MatrixSearchApproach1 {
    public static void main(String[] args) {
        int[][] A = {{1,3,5,7},{10, 11, 16, 20},{23, 30, 34, 50}};
        int target = 34;
        int row = 0;
        int col = A[0].length-1;

        while(row < A.length && col >= 0){
            if(A[row][col] == target){
                System.out.println(row+" "+col);
                break;
            }else if(A[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
    }
}
