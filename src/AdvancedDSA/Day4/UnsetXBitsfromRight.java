package AdvancedDSA.Day4;

public class UnsetXBitsfromRight {
    public static void main(String[] args) {
        int n = 37;
        int x = 3;

        for(int i=0; i<x; i++){
            if(checkBits.checkBitsNumber(n, i)){
                n = n ^ (1 << i);
            }
        }
        System.out.println(n);
    }
}
