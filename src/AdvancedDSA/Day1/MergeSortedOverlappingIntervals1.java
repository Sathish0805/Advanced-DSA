package AdvancedDSA.Day1;

import java.util.ArrayList;

public class MergeSortedOverlappingIntervals1 {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
//        int[][] arr = {{2, 10}, {4, 9}, {6, 7}};

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int currentStart = arr[0][0];
        int currentEnd = arr[0][1];

        for (int i = 1; i < arr.length; i++) {
            int iStart = arr[i][0];
            int iEnd = arr[i][1];
            if (currentEnd >= iStart) {
                currentStart = Math.min(currentStart, iStart);
                currentEnd = Math.max(currentEnd, iEnd);
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(currentStart);
                temp.add(currentEnd);
                ans.add(temp);
                currentStart = iStart;
                currentEnd = iEnd;
            }
        }
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(currentStart);
        temp.add(currentEnd);
        ans.add(temp);

        System.out.println(ans);
    }
}
