package AdvancedDSA1.Day10;

import java.util.HashMap;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {4, 3, 3, 2, 5, 6, 4, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        for(int num : arr){
            if(map.get(num) == 1){
                System.out.println(num);
                break;
            }
        }
    }
}
