package IntermediateDSA.Day7;

import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[arr.length-1]);

        int max = arr[arr.length-1];

        for (int i = arr.length-2; i >=0; i--) {
            if (arr[i] > max) {
                list.add(arr[i]);
                max = arr[i];
            }
        }
        System.out.println(list);
    }
}









/*
16, 17, 4, 3, 5, 2
0   1   2  3  4  5

max = 2
[2]

arr[4] > max =>


 */





