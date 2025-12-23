package LeetcodeProblems;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 5};
        int target = 6;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int a =  arr[i];
            int diff = target - a;
            if (map.containsKey(diff)) {
                int first = map.get(diff);
                System.out.println(first + " " + i);
                break;
            }
            map.put(a,i);
        }
    }
}
