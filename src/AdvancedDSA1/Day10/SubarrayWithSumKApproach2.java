package AdvancedDSA1.Day10;

public class SubarrayWithSumKApproach2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, -4, 1, 5, 6, 2, 5};
        int K = 11;

        int count = 0;

        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        for(int i = 0; i < arr.length; i++){
            for( int j = i; j < arr.length; j++){
                int sum = 0;
                if(i == 0){
                    sum = prefixSum[j];
                }else{
                    sum =  prefixSum[j] - prefixSum[i - 1];
                }
                if(sum == K){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
