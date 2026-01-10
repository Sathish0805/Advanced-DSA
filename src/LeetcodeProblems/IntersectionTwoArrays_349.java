package LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionTwoArrays_349 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        HashSet<Integer> set = new HashSet<>();
        for (int j : nums1) {
            set.add(j);
        }
        HashSet<Integer> set1 = new HashSet<>();
        for (int j : nums2) {
            set1.add(j);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int num : set){
            if(set1.contains(num)){
                list.add(num);
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
    }
}
