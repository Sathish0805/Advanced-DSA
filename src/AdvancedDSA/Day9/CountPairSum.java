package AdvancedDSA.Day9;

import java.util.HashMap;

public class CountPairSum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 5, 8, 5, 2, 8};
        int k = 10;

        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int a : arr) {
            int b = k - a;

            if (map.containsKey(b)) {
                ans += map.get(b);
            }

            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        System.out.println(ans);
    }
}
