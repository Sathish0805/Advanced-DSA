package AdvancedDSA.Day4;

public class ReturnNonDuplicateNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 3, 5, 6, 5, 7};

        int xorAll = 0;
        for (int j : arr) xorAll = (xorAll ^ j);

        int position = 0;
        for(int i = 0; i < 32; i++){
            if(checkBits.checkBitsNumber(xorAll, position)){
                position = i;
                break;
            }
        }

        int first= 0,second= 0;
        for (int j : arr) {
            if (checkBits.checkBitsNumber(j, position)) {
                first = first ^ j;
            } else {
                second = second ^ j;
            }
        }
        System.out.println(first);
        System.out.println(second);

    }
}
