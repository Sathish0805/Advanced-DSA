package AdvancedDSA2.Day3;

public class FindSingleElementSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 7};

        int n = arr.length;

        if(n == 1) System.out.println(arr[0]);
        if(arr[0] != arr[1]) System.out.println(arr[0]);
        if(arr[n-1] != arr[n-2]) System.out.println(arr[n-1]);

        int low = 1;
        int high = arr.length-2;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]){
                System.out.println(arr[mid]);
                break;
            }
            int firstOccurance;
            if(arr[mid] == arr[mid+1]){
                firstOccurance = mid;
            }else {
                firstOccurance = mid-1;
            }

            if(firstOccurance % 2 == 0){
                low = firstOccurance+2;
            }else {
                high = firstOccurance-1;
            }
        }
    }
}
