package LeetcodeProblems;

public class ReverseWordsInStringIIIApproach2 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        StringBuilder ans = new StringBuilder();
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || i == s.length() - 1) {

                int end = (i == s.length() - 1) ? i : i - 1;

                for (int j = end; j >= start; j--) {
                    ans.append(s.charAt(j));
                }

                if (i != s.length() - 1) {
                    ans.append(" ");
                }

                start = i + 1;
            }
        }
        System.out.println(ans);
    }
}
