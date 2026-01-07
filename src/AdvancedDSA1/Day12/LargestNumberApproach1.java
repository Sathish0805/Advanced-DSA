package AdvancedDSA1.Day12;

public class LargestNumberApproach1 {
    public static void main(String[] args) {
        int[] arr = {12, 121};
        int sum = arr[0];
        for (int i =  1; i < arr.length; i++) {
            String A = String.valueOf(sum);
            String B = String.valueOf(arr[i]);
            if(findLargest(A, B) >= 1){
                String val = A + B;
                sum = Integer.parseInt(val);
            }else if(findLargest(A, B) <= -1){
                String val = B + A;
                sum = Integer.parseInt(val);
            }
        }
        System.out.println(sum);
    }
    static int findLargest(String A, String B){
        return (A+B).compareTo(B+A);
    }
}
