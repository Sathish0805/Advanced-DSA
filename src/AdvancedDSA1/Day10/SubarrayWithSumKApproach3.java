package AdvancedDSA1.Day10;

public class SubarrayWithSumKApproach3 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, -4, 1, 5, 6, 2, 5};
        int K = 10;

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for( int j = i; j < arr.length; j++){
                sum += arr[j];
                if(sum == K){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
