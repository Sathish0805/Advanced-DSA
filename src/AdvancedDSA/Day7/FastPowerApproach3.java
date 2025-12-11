package AdvancedDSA.Day7;

public class FastPowerApproach3 {
    public static void main(String[] args) {
        int A = 1;
        int B = 1000000000;
        System.out.println(power(A,B));
    }
    static Long power(int A, int B) {
        if (B == 0) return 1L;
        Long pow = power(A, B/2);
        if(B%2==0){
            return pow * pow;
        }else{
            return pow * pow * A;
        }

    }
}
