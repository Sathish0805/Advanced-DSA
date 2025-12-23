package LeetcodeProblems;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int i = 0, j  = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            System.out.println(sum);
            if (sum == target) {
                System.out.println(Arrays.toString(new int[]{i + 1, j + 1}));
                break;
            }else if (sum > target) {
                j--;
            }else{
                i++;
            }
        }
    }
}
