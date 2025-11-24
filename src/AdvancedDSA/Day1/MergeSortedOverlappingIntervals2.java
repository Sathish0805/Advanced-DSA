package AdvancedDSA.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeSortedOverlappingIntervals2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(1,3)));
        A.add(new ArrayList<>(Arrays.asList(6,9)));

        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(2,5));

        A.add(B);
        Collections.sort(A, (a,b) -> a.get(0) - b.get(0));

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int currentStart = A.get(0).get(0);
        int currentEnd = A.get(0).get(1);

        for(int i = 1; i < A.size(); i++){
            int iStart = A.get(i).get(0);
            int iEnd = A.get(i).get(1);
            if(currentEnd >= iStart){
                currentStart = Math.min(currentStart, iStart);
                currentEnd = Math.max(currentEnd, iEnd);
            }else {
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
