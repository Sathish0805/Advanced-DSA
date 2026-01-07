package AdvancedDSA1.Day10;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatApproach1 {
    public static void main(String[] args) {
        String s = "abcdadbcbb";

        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j+1);
                HashSet<Character> set = new HashSet<>();
                for (int k = 0; k < sub.length(); k++) {
                    set.add(sub.charAt(k));
                }
                max = Math.max(max, set.size());
            }
        }
        System.out.println(max);
    }
}
