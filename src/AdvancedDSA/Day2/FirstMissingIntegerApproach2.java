package AdvancedDSA.Day2;

import java.util.Arrays;

public class FirstMissingIntegerApproach2 {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1, 2, 3, 4};
        Arrays.sort(arr);
        int number = 1;

        for(int i : arr){
            if(i==number){
                number++;
            }
        }
        System.out.print(number);

    }
}
