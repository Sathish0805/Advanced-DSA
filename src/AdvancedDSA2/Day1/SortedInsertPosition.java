package AdvancedDSA2.Day1;

public class SortedInsertPosition {
    public static void main(String[] args) {
        int[] A = {1, 4, 9};
        int B = 3;
        int index = A.length;
        int low = 0;
        int high = A.length-1;

        while (low <= high) {
            int mid = low + (high - low)/2;
            if (A[mid] == B) {
                index = mid;
                break;
            }else if (A[mid] >= B && index > mid) {
                index = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        System.out.println(index);
    }
}
