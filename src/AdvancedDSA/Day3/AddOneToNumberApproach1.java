package AdvancedDSA.Day3;

import java.util.ArrayList;
import java.util.Collections;

public class AddOneToNumberApproach1 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3};
        int[] arr = {1, 1, 1, 3, 2, 1, 1, 2, 5, 9, 6, 6};


        int i=0;
        long sum = 0;
        while (i < arr.length) {
            sum = (sum * 10) + arr[i];
            i++;
        }
        sum += 1;
        System.out.println(sum);

        ArrayList<Long> list = new ArrayList<>();

        while (sum > 0) {
            long  num = sum % 10;
            list.add(num);
            sum = sum / 10;
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
