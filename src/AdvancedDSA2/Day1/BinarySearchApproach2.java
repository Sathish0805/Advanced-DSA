package AdvancedDSA2.Day1;

public class BinarySearchApproach2 {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12, 14, 19, 20, 23, 25, 27};
        int k = 20;

        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] == k) {
                System.out.println(mid);
                break;
            }else if (arr[mid] < k) {
                i = mid + 1;
            }else {
                j = mid - 1;
            }
        }
    }
}