package AdvancedDSA2.Day1;

public class LocalMinimaApproach2 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 8, 7, 3, 6, 4, 1, 10, 2};

        if (arr.length == 1) System.out.println(arr[0]);
        if(arr[0] < arr[1]) System.out.println(arr[0]);
        if(arr[arr.length-1] <  arr[arr.length-2]) System.out.println(arr[arr.length-1]);

        int low = 1, high = arr.length - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[mid + 1] &&  arr[mid] < arr[mid - 1]) {
                System.out.println(arr[mid]);
                break;
            }else if (arr[mid] > arr[mid + 1]) {
                low = mid + 1;
            }else if (arr[mid] > arr[mid - 1]) {
                high = mid - 1;
            }
        }
    }
}
