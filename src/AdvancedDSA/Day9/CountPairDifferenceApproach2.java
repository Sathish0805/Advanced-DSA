package AdvancedDSA.Day9;

import java.util.Arrays;
import java.util.HashMap;

public class CountPairDifferenceApproach2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2};
        int k = 1;

        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int j : arr) {
            ans += map.getOrDefault(j - k, 0);
            ans += map.getOrDefault(j + k, 0);
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        System.out.println(ans);
    }
}
