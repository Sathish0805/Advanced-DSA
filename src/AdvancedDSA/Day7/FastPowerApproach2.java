package AdvancedDSA.Day7;

public class FastPowerApproach2 {
    public static void main(String[] args) {
        int A = 2;
        int B = 5;
        System.out.println(power(A,B));
    }
    static int power(int A, int B) {
        if (B == 0) return 1;
        if(B%2 == 0){
            return power(A, B/2) * power(A, B/2);
        }else{
            return power(A, B/2) *  power(A, B/2) * A;
        }
    }
}
