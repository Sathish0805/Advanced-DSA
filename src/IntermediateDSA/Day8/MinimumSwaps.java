package IntermediateDSA.Day8;

import AdvancedDSA1.Day2.FirstMissingIntegerApproach3;

public class MinimumSwaps {
    public static void main(String[] args) {

        int[] arr = {52,7,93,47,68,26,51,44,5,41,88,19,78,38,17,13,24,74,92,5,84,27,48,49,37,59,3,56,79,26,55,60,16,83,63,40,55,9,96,29,7,22,27,74,78,38,11,65,29,52,36,21,94,46,52,47,87,33,87,70};
        int B = 19;

        int good = 0;
        for (int j : arr) {
            if (j <= B) {
                good++;
            }
        }

        if(good == 0 || good == arr.length){
            System.out.println(0);
        }

        int bad = 0;
        for(int i = 0; i < good; i++){
            if(arr[i] > B){
                bad++;
            }
        }
        int min = bad;
        for(int i = good; i < arr.length;  i++){
            if(arr[i - good] > B){
                bad--;
            }
            if(arr[i] > B){
                bad++;
            }
            min = Math.min(min,bad);
        }
        System.out.println(min);
    }
}
