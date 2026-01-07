package AdvancedDSA1.Day10;

import java.util.HashMap;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {4, 3, 3, 2, 5, 6, 40, 5};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if(map.get(i) == 2){
                System.out.println(i);
                break;
            }
        }
//        System.out.println(map);

//        for( int i = 0; i < arr.length; i++ ) {
//            if(map.get(arr[i]) > 1) {
//                System.out.println(arr[i]);
//                break;
//            }
//        }
    }
}
