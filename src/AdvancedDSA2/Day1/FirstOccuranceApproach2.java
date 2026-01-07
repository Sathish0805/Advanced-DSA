package AdvancedDSA2.Day1;

public class FirstOccuranceApproach2 {
    public static void main(String[] args) {
        int[] arr = {-5, -5, -3, 0, 1, 1, 1, 1, 5, 6, 7};
        int k = 10;

        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                ans = mid;
                high = mid - 1;
            }else if (arr[mid] < k) {
                low = mid + 1;
            }else  {
                high = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
