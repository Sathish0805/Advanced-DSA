package AdvancedDSA1.Day10;

public class SubarrayWithSumZeroApproach2 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, -3, 4, 3, 1, -2, -3, 2};

        int[] prefix = new  int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for( int j = i;  j < arr.length; j++) {
                int sum = 0;
                if(i == 0) {
                    sum += prefix[j];
                }else{
                    sum += prefix[j] - prefix[i-1];
                }
                if(sum == 0){
                    System.out.println(true);
                    break;
                }
            }
        }
    }
}
