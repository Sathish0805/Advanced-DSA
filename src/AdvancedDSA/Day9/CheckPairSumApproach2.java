package AdvancedDSA.Day9;

public class CheckPairSumApproach2 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 1, 2};
        int K = 5;

        for(int i = 0; i < arr.length; i++){
            int a = arr[i];
            int b = K - a;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] == b){
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
    }
}
