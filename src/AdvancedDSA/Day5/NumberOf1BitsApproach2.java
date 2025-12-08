package AdvancedDSA.Day5;

public class NumberOf1BitsApproach2 {
    public static void main(String[] args) {
        int num = 127;
        int count = 0;
        while (num > 0) {
            if((num & 1) == 1) count++;
            num = num >> 1;
        }
        System.out.println(count);
    }
}
