package AdvancedDSA.Day7;

public class CheckPalindromeUsingRecursion {
    public static void main(String[] args) {
        String A = "mannam";
        System.out.println(checkPalindrome(A, 0, A.length()-1));
    }
    static boolean checkPalindrome(String A, int i,  int j) {
        if(i >= j) return true;

        if(A.charAt(i) != A.charAt(j)){
            return false;
        }

        return checkPalindrome(A,i+1, j-1);
    }
}
