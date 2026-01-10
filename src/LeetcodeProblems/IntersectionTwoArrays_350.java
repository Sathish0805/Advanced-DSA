package LeetcodeProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class IntersectionTwoArrays_350 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int k : nums1) {
            map.put(k, map.getOrDefault(k, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int j : nums2) {
            if (map.containsKey(j)) {
                list.add(j);
                if(map.get(j)>1){
                    map.put(j, map.get(j)-1);
                }else {
                    map.remove(j);
                }
            }
        }
        System.out.println(list);
    }
}


