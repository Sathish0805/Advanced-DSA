package AdvancedDSA.Day3;

import java.util.ArrayList;
import java.util.Collections;

public class AddOneToNumberApproach2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 2, 1, 1, 2, 5, 9, 6, 6};

        ArrayList<Integer> arr1 = new ArrayList<>();
        int carry = 1;
        for(int i = arr.length-1;i>=0;i--){
            int num =  arr[i] + carry;
            arr1.add(num%10);
            carry = num/10;
        }
        if(carry > 0){
            arr1.add(carry);
        }
        Collections.reverse(arr1);
        System.out.println(arr1);
    }
}
