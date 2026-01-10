package LeetcodeProblems;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges_228 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 6, 8, 9};

        List<String> list = new ArrayList<>();

        int start = nums[0];

        for (int i = 1; i <= nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    list.add(String.valueOf(start));
                } else {
                    list.add(start + "->" + nums[i - 1]);
                }
                start = nums[i];
            }
        }

        if (start == nums[nums.length - 1]) {
            list.add(String.valueOf(start));
        } else {
            list.add(start + "->" + nums[nums.length - 1]);
        }

        System.out.println(list);
    }
}


/*

0, 1, 2, 3, 4, 6, 8, 9

start = 0

i = 1 => 1 - 0 = 1
i = 2 => 2 - 1 = 1
i = 3 => 3 - 2 = 1
i = 4 => 4 - 3 = 1
i = 5 => 6 - 4 = 2  ->  ans = [0->4] start = 6
i = 6 => 8 - 6 = 2  ->  ans = [0->4, 6] start = 8
i = 7 => 9 - 8 = 1

ans = [0->4, 6, 8->9]


for i -> n
   for i -> n  => n * n


for i -> n

for i -> n

n + n

n = 10
i. 10 * 10 = 100 iteration
ii. 10 + 10 = 20 iteration


n
n, n

n + n = 2n -> n



 */