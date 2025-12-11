package AdvancedDSA.Day9;

import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        int[] arr = {3,3,3};

        HashSet<Integer> set = new HashSet<>();

        for(int a : arr){
            set.add(a);
        }
        System.out.println(set.size());
    }
}
