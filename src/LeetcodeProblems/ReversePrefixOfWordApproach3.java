package LeetcodeProblems;

public class ReversePrefixOfWordApproach3 {
    public static void main(String[] args) {
        String word = "abcdefg";
        char ch = 'd';

        StringBuilder sb = new StringBuilder();
        int index = word.indexOf(ch);

        sb.append(word.substring(0,index+1)).reverse();
        sb.append(word.substring(index+1));

        System.out.println(sb);
    }
}
