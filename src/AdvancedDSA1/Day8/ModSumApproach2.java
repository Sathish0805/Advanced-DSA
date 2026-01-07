package AdvancedDSA1.Day8;

import java.util.Arrays;

public class ModSumApproach2 {
    public static void main(String[] args) {
        int arr[] = {17, 100, 11};
        int sum = 0;
        Arrays.sort(arr);

        for (int k : arr) {
            for (int i : arr) {
                if (i > k) {
                    sum += k;
                    break;   // all further i will also be > k
                }
                sum += k % i;
            }
        }

        System.out.println(sum);
    }
}
