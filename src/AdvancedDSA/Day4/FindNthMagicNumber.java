package AdvancedDSA.Day4;

public class FindNthMagicNumber {
    public static void main(String[] args) {
        int n = 10;
        int num = 5;
        int sum = 0;
        for (int i = 0; i < 32; i++) {
            if(checkBits.checkBitsNumber(n,i)){
                sum += (int) Math.pow(num,i+1);
            }
        }
        System.out.println(sum);
    }
}
