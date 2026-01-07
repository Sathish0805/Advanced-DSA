    package AdvancedDSA1.Day10;

    import java.util.Arrays;

    public class SubarrayWithGivenSumApproach2 {
        public static void main(String[] args) {
    //        int[] arr = {1,2,3,4,5};
    //        int num = 5;

            int[] arr = {5, 10, 20, 100, 105};
            int num = 110;

            int[] prefixSum = new int[arr.length];
            prefixSum[0] = arr[0];
            for(int i = 1; i < arr.length; i++){
                prefixSum[i] = prefixSum[i-1] + arr[i];
            }

            int i = 0;
            int j = 0;

            boolean found = false;

            while (i < arr.length && j < arr.length) {

                int sum;
                if (i == 0) {
                    sum = prefixSum[j];
                } else {
                    sum = prefixSum[j] - prefixSum[i - 1];
                }

                if (sum == num) {
                    found = true;
                    break;
                } else if (sum < num) {
                    j++;
                } else {
                    i++;
                    if (i > j) {
                        j = i;
                    }
                }
            }

            if (found) {
                System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, j + 1)));
            } else {
                System.out.println(-1);
            }
        }
    }
