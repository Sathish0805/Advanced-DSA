package LeetcodeProblems;

import java.util.Arrays;

public class ClosestThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1000, -5, -5, -5, -5, -1, -1, -1};
        int target = -14;
        Arrays.sort(arr);

        int ans = arr[0] + arr[1] + arr[2];

        for( int i = 0 ; i < arr.length ; i++ ){
            int x = arr[i];
            int left = i + 1;
            int right = arr.length - 1;
            while(left < right){
                int sum = x + arr[left] + arr[right];
                if(sum == target){
                    ans = target;
                }
                int diff1 =  Math.abs(sum - target);
                int diff2 = Math.abs(ans - target);
                if(diff1 < diff2){
                    ans = sum;
                }

                if(sum > target){
                    right--;
                }else {
                    left++;
                }
            }
        }
        System.out.println(ans);
    }
}




/*
-1, 2, 1, -4
target = 1

-4, -1, 1, 2

 n = 4;

 n > 3 => ans = arr[0] + arr[1] + arr[2] = -4 + -1 + 1 = -4

 -4 -1  1  2
     x  i  j

  -4 + -1 + 2 = -3
        1 - (-3) = 4    --- ans = -3
        1 - (-4) = 5
  -4 + 1 + 2 =  -1
        1 - (-1) = 2    --- ans = -1
        1 - (-3) = 4
  -1 + 1 + 2 = 2
        1 - 2    = 1    --- ans = 2
        1 - (-1) = 2




    1
    -2 3 4 5 -1 -4 -5 1

    1 - (-2) => 3
    1 - 3 => 2
    1 - 4 => 3
             4
             2
             5
             6
     1 - 1 = 0


    0 1 2 3 4
    1 2 3 4 5

    i == 2 => continue
    1 2 4 5

    i == 2 => break
    1 2


 */