package AdvancedDSA.Day4;

public class UnsetIthBit {
    public static void main(String[] args) {
        int n = 5;
        int i = 2;

        if(checkBits.checkBitsNumber(n, i)){
            System.out.println((n ^ (1 << i)));
        }else {
            System.out.println(n);
        }
    }
}
