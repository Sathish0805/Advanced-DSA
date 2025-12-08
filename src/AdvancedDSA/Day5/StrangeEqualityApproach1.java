package AdvancedDSA.Day5;

public class StrangeEqualityApproach1 {
    public static void main(String[] args) {
        int A = 5833230;

        int X = 0,Y = 0;
        for(int i = A-1; i >= 0; i--){
            if((A ^ i) == A + i){
                X = i;
                break;
            }
        }
        for(int i = A+1; i <= Integer.MAX_VALUE; i++){
            if((A ^ i) == A + i){
                Y = i;
                break;
            }
        }
        System.out.println(X + " " + Y + " " + (X ^ Y));
    }
}
