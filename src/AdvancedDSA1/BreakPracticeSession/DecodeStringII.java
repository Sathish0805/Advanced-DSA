package AdvancedDSA1.BreakPracticeSession;

public class DecodeStringII {
    public static void main(String[] args) {
        String A = "RICK";
        for (int i = 0; i < A.length(); i++) {
            if((int) A.charAt(i) + i + 1 > 90){
                System.out.print((char) (A.charAt(i) - 26 + i + 1));
            }else{
                System.out.print((char) (A.charAt(i) + i + 1));
            }
        }
    }
}
