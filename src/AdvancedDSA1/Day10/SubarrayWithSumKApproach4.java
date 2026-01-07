package AdvancedDSA1.Day10;

import java.util.HashMap;

public class SubarrayWithSumKApproach4 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, -4, 1, 5, 6, 2, 5};
        int k = 10;

        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++){
            int a = prefixSum[i];
            int b = a - k;
            if (map.containsKey(b)){
                ans += map.get(b);
            }
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        System.out.println(ans);
    }
}
