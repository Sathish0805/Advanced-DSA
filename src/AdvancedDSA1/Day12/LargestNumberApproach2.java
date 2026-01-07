package AdvancedDSA1.Day12;

import java.util.Arrays;

public class LargestNumberApproach2 {
    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};

        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, (a,b) -> (b+a).compareTo(a+b));
        System.out.println(Arrays.toString(arr));

        if(arr[0].equals("0")){
            System.out.println("0");
        }

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        System.out.println(sb.toString());
    }
}


/*
3, 30, 34, 5, 9
"3", "30", "34", "5", "9"

"9", "5", "34", "3", "30"

Arrays.sort(arr, (a,b) -> (b+a).compareTo(a+b));

"3" , "30" => ("303").compareTo("330") => 330
"330" , "34" => ("34330").compareTo("33034") => 34330

*/