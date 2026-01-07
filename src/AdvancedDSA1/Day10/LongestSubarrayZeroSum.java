package AdvancedDSA1.Day10;

import java.util.HashMap;

public class LongestSubarrayZeroSum {
    public static void main(String[] args) {
        int[] arr = {1, -2, 1, 2};

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        System.out.println(max);

    }
}
