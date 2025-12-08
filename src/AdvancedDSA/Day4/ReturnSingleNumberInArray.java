package AdvancedDSA.Day4;

public class ReturnSingleNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 3, 5};
        int xorAll = 0;
        for(int i = 0; i < arr.length; i++){
            xorAll = xorAll ^ arr[i];
        }
        System.out.println(xorAll);
    }
}
