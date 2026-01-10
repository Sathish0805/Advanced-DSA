package LeetcodeProblems;

public class RangeSumQuery_303 {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};

        int left = 1;
        int right = 4;
        int sum = 0;
        for(int i = left; i <= right; i++) {
            sum += nums[i];
        }
        System.out.println(sum);

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }
        System.out.println(prefix[right] -  prefix[left-1]);


    }
}





/*
arr = -2, 0, 3, -5, 2, -1
       0  1  2   3  4   5


query = 0, 2  -> [0,2] => 0, 1, 2

-2 + 0 + 3 => 1





 0  1  2  3  4  5
-2  0  3 -5  2 -1

-2  -2+0


 index         0 1 2 3  4
 array         1 2 3 4  5
 prefix array  1 3 6 10 15

[3, 4]
4 + 5 = 9
pf[4] - pf[3-1] = 15 - 6 = 9




1 + 2 + 3 + 4 = 10

[0,3]

if left = 0 => sum = prefix[right] = prefix[3] = 10

[1, 4]

2 + 3 + 4 + 5 = 14

else => prefix[right] - prefix[left-1] =prefix[4] - prefix[1] = 15 - 3 = 12


arr = 1 2 3
      1 3 6




prefix[0] = 1
prefix[1] = arr[1] + prefix[1-1] => 2 + 1 = 3
prefix[2] = arr[2] + prefix[2-1] => 3 + 3 = 6



[0, 2] => prefix[2] = 6






[1, 4] => 1 2 3 4
[2, 5] => 2 3 4 5

left = 1,  right = 4

-2   0  3  -5   2  -1
   /  /   /   /   /
-2  -2  1  -4  -2  -3

 0 + 3 + -5 + 2 = 0

 prefix[4] - prefix[1-1]

 -2 - (-2) = 0





-2   0  3  -5   2  -1

-2  -2  1  -4  -2  -3
[0,2]

[-2]
[-2, 0]
[-2, 0, 3]




[-2, 0, 3, -5, 2, -1]

[[0, 2], [2, 5], [0, 5]]


3 + 4 + 6 = 13

6 + 3 = 9




 */