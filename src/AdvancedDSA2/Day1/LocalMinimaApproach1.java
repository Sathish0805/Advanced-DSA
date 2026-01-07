package AdvancedDSA2.Day1;

public class LocalMinimaApproach1 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 8, 7, 3, 6, 4, 1, 10, 2};
        if (arr.length == 0) System.out.println(arr[0]);
        if(arr[0] < arr[1]) System.out.println(arr[0]);
        for(int i = 1; i < arr.length-1; i++){
            if(arr[i-1] > arr[i] &&  arr[i+1] > arr[i]){
                System.out.println(arr[i]);
            }
        }
        if(arr[arr.length-1] <  arr[arr.length-2]) System.out.println(arr[arr.length-1]);
    }
}
