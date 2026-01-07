package LeetcodeProblems;

import java.util.HashMap;

public class CountElementsMaximumFrequency {
    public static void main(String[] args) {
        int[] arr = {2,3, 3, 3,1, 1,4};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        int max = 0;
        for(int num : map.values()){
            max = Math.max(max, num);
        }

        int count = 0;
        for(int value : map.values()){
            if (value == max) count++;
        }

        System.out.println(max  * count);
    }
}
