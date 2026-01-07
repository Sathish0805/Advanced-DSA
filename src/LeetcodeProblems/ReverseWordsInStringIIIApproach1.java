package LeetcodeProblems;

public class ReverseWordsInStringIIIApproach1 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        String[] sb = s.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (String string : sb) {
            reversed.append(new StringBuilder(string).reverse()).append(" ");
        }
        System.out.println(reversed.toString());
    }
}
