package AdvancedDSA.Day9;

import java.util.Arrays;
import java.util.HashMap;

public class FrequencyOfElementQueryApproach2 {
    public static void main(String[] args) {
        int[] arr = {7,6,6,3,1,5,7};
        int[] query = {2,1,7,5,8};
        int[] ans = new int[query.length];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (!map.containsKey(i))
                map.put(i, 1);
            else
                map.put(i, map.get(i) + 1);
        }

        for (int i = 0; i < query.length; i++) {
            if(map.containsKey(query[i])){
                ans[i] = map.get(query[i]);
            }else{
                ans[i] = 0;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
