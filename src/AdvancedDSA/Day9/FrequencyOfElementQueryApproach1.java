package AdvancedDSA.Day9;

import java.util.Arrays;

public class FrequencyOfElementQueryApproach1 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 8, 2, 8, 2, 3, 8, 10, 8};
        int[] query = {2, 8};
        int[] ans = new int[query.length];

        for(int i=0; i<query.length; i++){
            int count=0;
            for (int k : arr) {
                if (k == query[i]) {
                    count++;
                }
            }
            ans[i]=count;
        }
        System.out.println(Arrays.toString(ans));
    }
}
