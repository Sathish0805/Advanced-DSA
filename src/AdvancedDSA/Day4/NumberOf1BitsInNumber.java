package AdvancedDSA.Day4;


public class NumberOf1BitsInNumber {
    public static void main(String[] args) {
        int number = 7;
        int count = 0;
        for(int i=0; i<32; i++){
            if(checkBits.checkBitsNumber(number,i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
