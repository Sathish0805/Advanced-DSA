package AdvancedDSA2.Day1;

public class MatrixSearchApproach2 {
    public static void main(String[] args) {
        int[][] A = {{1,3,5,7},{10, 11, 16, 20},{23, 30, 34, 50}};
        int target = 34;
        int row = A.length;
        int col = A[0].length;

        int low = 0;
        int high = row*col - 1;

        while(low<=high){
            int mid = low+(high-low)/2;

            int r = mid/col;
            int c = mid%col;
            if(A[r][c] == target){
                System.out.println(A[r][c]);
                break;
            }else  if(A[r][c] < target){
                low = mid+1;
            }else  if(A[r][c] > target){
                high = mid-1;
            }
        }
        System.out.println("Not Found");
    }
}
