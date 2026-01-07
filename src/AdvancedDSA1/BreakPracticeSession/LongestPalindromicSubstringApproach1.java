package AdvancedDSA1.BreakPracticeSession;

public class LongestPalindromicSubstringApproach1 {
    public static void main(String[] args) {
        String A = "feacabacabgf";
        int ans = 0;
        for (int i = 0; i <= A.length()-1; i++) {
            for (int j = i+1; j <= A.length()-1; j++) {
                if (isPalindrome(A, i, j)){
                    ans = Math.max(ans, j-i+1);
                }
            }
        }
        System.out.println(ans);

    }
    static boolean isPalindrome(String A, int start, int end) {
        while (start < end) {
            if (A.charAt(start) != A.charAt(end)) {
                return  false;
            }
            start++;
            end--;
        }
        return true;
    }
}
