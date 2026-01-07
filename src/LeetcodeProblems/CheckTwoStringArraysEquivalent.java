package LeetcodeProblems;

public class CheckTwoStringArraysEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(String.join("", word1).equals(String.join("", word2)));
    }
}
