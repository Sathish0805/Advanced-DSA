package AdvancedDSA1.BreakPracticeSession;

public class LongestPalindromicSubstringApproach2 {
    public static void main(String[] args) {
        String A = "adaebcdfdcbetggte";
        String ans = "";
        for (int i = 0; i <= A.length()-1; i++){
            String odd = expandString(A,i,i);
            String even = expandString(A,i,i+1);
            if(odd.length() > ans.length()) ans = odd;
            if(even.length() > ans.length()) ans = even;
        }
        System.out.println(ans);
    }
    static String expandString(String S, int start, int end) {
        int n =  S.length();
        while( start >= 0 && end < n && S.charAt(start) == S.charAt(end)) {
            start--;
            end++;
        }
        return S.substring(start+1, end);
    }
}
