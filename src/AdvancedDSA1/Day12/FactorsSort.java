package AdvancedDSA1.Day12;

import java.util.Arrays;
import java.util.Comparator;

public class FactorsSort {
    public static void main(String[] args) {
        Integer[] arr = {6, 8, 9};
        Arrays.sort(arr, new FactorComparator());
        System.out.println(Arrays.toString(arr));
    }
    static Integer factorial(Integer n){
        int count = 0;
        Integer i = 0;

        for (i = 1; i * i < n; i++){
            if (n % i == 0){
                count = count + 2;
            }
        }
        if(i * i  == n){
            count = count + 1;
        }
        return count;
    }
}

class FactorComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        Integer count1 = FactorsSort.factorial(o1);
        Integer count2 = FactorsSort.factorial(o2);
        if (count1 < count2){
            return -1;
        }else if (count1 > count2){
            return 1;
        }else{
            if(o1 <  o2){
                return -1;
            }else{
                return 1;
            }
        }
    }
}

