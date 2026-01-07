package AdvancedDSA2.Day1;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {5, 17, 100, 23};
        int n = arr.length;
        int index = 0;

        if(arr.length == 1) index = 0;
        else if(arr[0] >= arr[1]) index = 0;
        else if(arr[n-1] >= arr[n-2]) index = n-1;
        else {

            int low = 1, high = n-2;
            while(low <= high){
                int mid = low + (high - low)/2;

                if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                    index = mid;
                    break;
                }
                if(arr[mid] < arr[mid+1]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }

        }
        System.out.println(arr[index]);
    }
}
