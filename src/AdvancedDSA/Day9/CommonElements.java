package AdvancedDSA.Day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class CommonElements {
    public static void main(String[] args) {
        int[] A = {1, 1, 2, 2};
        int[] B = {1, 2, 2, 3};

        ArrayList<Integer> ans = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : A) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        for (int j : B) {
            if (map.containsKey(j)) {
                ans.add(j);
                if (map.get(j) == 1) {
                    map.remove(j);
                } else {
                    map.put(j, map.get(j) - 1);
                }
            }
        }
        Collections.sort(ans);
        System.out.println(ans);
    }
}
