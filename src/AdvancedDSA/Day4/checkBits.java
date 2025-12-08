package AdvancedDSA.Day4;

public class checkBits {
    static boolean checkBitsNumber(int number, int i) {
        return (number & (1 << i)) != 0;
    }
}
