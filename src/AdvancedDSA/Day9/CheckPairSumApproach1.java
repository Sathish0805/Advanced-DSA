package AdvancedDSA.Day9;

public class CheckPairSumApproach1 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 1, 2};
        int K = 10;

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]+arr[j]==K){
                    System.out.println(true);
                    break;
                }
            }
        }
    }
}
