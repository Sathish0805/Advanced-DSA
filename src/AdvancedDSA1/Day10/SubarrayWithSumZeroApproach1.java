package AdvancedDSA1.Day10;

public class SubarrayWithSumZeroApproach1 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, -3, 4, 3, 1, -2, -3, 2};

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum +=arr[k];
                }
                if(sum==0){
                    System.out.println(true);
                    break;
                }
            }
        }
    }
}
