package AdvancedDSA.Day5;

public class NumberOf1BitsApproach1 {
    public static void main(String[] args) {
        int num = 127;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((num & 1) != 0) count++;
            num >>>= 1;
        }
        System.out.println(count);
    }
}
