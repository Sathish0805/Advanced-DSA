package LeetcodeProblems;

public class BackspaceStringCompareApproach1 {
    public static void main(String[] args) {
        String s = "ab#c#"; // 5 n
        String t = "##a#b#a"; // 7 m
        String s1 = RemoveHash(s); // 5 n
        String s2 = RemoveHash(t); // 7 m
        System.out.println(s1.equals(s2));
    }
    static String RemoveHash(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#' && sb.length() <= 0) {
                continue;
            }else if (s.charAt(i) == '#') {
                sb.deleteCharAt(sb.length()-1);
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}

/*
  a b # c # b

  a b

  # # a # b # a c

  a c

  # # a # b a # #

  _

    a b # c #
            i

    ans = ""
    i = 0 => a != # => ans= "a"
    i = 1 => b != # => ans = "ab"
    i = 2 => # == # => ans = "a"
    i = 3 => c != # => ans = "ac"
    i = 4 => # == # => ans = "a"

   abcd => 4 = n
   acsdf => 5 = m
   n + n = 2n => n
   m + n => n + m
   4 + 4 => 8

*/