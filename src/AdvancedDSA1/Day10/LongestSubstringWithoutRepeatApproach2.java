package AdvancedDSA1.Day10;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatApproach2 {
    public static void main(String[] args) {
        String s = "abcabcbb";

        HashSet<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int ans = 0;
        while (j < s.length()) {
            if (set.contains(s.charAt(j))) {
                while(set.contains(s.charAt(j))) {
                    set.remove(s.charAt(i));
                    i++;
                }
            }else {
                set.add(s.charAt(j));
                ans  = Math.max(ans, set.size());
                j++;
            }
        }
        System.out.println(ans);
    }
}
