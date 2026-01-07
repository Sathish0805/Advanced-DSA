package LeetcodeProblems;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaran";
        if(s.length() != t.length()) System.out.println(false);
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        System.out.println(Arrays.equals(s1, t1));
    }
}
/*

target  = 10;
set - []
1 2 5 5
0 1 2 3

i = 0; 10 - 1 = 9
set - 9 => set = [1]

i = 1; 10 - 2 =8
set - 8 => set = [1, 2]

i = 2; 10 - 5 = 5
set - 5 => set = [1, 2, 5]

i = 3; 10 - 5 = 5;
set - 5;

 */
