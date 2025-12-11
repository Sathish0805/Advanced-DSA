package AdvancedDSA.Day9;

import java.util.HashMap;
import java.util.Map;

public class CountUniqueElements {
    public static void main(String[] args) {
        int[] arr = {13,15,13,2,9,3,10,10,20,13};
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        for(int i : map.values()){
            if(i == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
