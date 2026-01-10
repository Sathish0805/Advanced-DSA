package LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0};
        Arrays.sort(arr);
        int target = 0;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length-2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            int x = arr[i];
            if(x > 0) break;
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int sum = x + arr[left] + arr[right];
                if (sum == target) {
                    ans.add(new ArrayList<>(Arrays.asList(x, arr[right], arr[left])));
                    while (left < right && arr[left] == arr[left + 1]) left++;
                    while (left < right && arr[right] == arr[right - 1]) right--;

                    left++;
                    right--;
                }else if (sum > target) {
                    right--;
                }else  {
                    left++;
                }
            }
        }
        System.out.println(ans);
    }
}







/*
-1, 0, 1, 2, -1, -4  0 0 0

-4, -1, -1, 0, 1, 2
 X   i            j

 x + i + j = 0

 -4 + -1 + 2 = -3 < 0 => i++
 -4 + -1 + 2 = -3 < 0 => i++
 -4 + 0 + 2  = -2 < 0 => i++
 -4 + 1 + 2  = -1 < 0 => i++

 -1 + -1 + 2 = 0 == 0 => [[-1, -1, 2]]
 -1 + 0 + 2 = 1 > 0 j--
 -1 + 0 + 1 = 0 == 0 => [[-1, -1, 2], [-1, 0, 1]]

 -1 + 0 + 2 = 1 > 0 j--
 -1 + 0 + 1 = 0 == 0 => [[-1, -1, 2], [-1, 0, 1]]

  0 + 1 + 2 = 3 > 0 j--

 0   1   2  3  4  5
-1, -1, -1, 0, 1, 2
 X       i         j

 x + i + j = 0

   -1 + -1 + 2 = 0   [[-1, -1, 2]]
   i == i+1  arr[1] == arr[2]  i++
   j == j-1


   -1 + -1 + 2 = 0


*/







