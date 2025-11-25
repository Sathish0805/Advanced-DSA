package NormalDiscussion;

public class ReduceString {
    public static void main(String[] args) {
        String s = "aaaba";
        String ans = String.valueOf(s.charAt(0)); //s.substring(0,1);
        char currChar = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == currChar){
                count++;
            }else{
                ans = ans.concat(String.valueOf(count));
                ans = ans.concat(String.valueOf(c));
                count = 1;
                currChar = c;
            }
        }
        ans = ans.concat(String.valueOf(count));
        System.out.println(ans);
        System.out.println(ans.length() < s.length() ?  ans : s);
    }
}