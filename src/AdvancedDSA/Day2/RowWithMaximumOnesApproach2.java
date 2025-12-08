package AdvancedDSA.Day2;

import java.util.ArrayList;
import java.util.Arrays;

public class RowWithMaximumOnesApproach2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(0,0,0,0)));
        A.add(new ArrayList<>(Arrays.asList(0,0,0,1)));
        A.add(new ArrayList<>(Arrays.asList(0,1,1,1)));
        A.add(new ArrayList<>(Arrays.asList(0,1,1,1)));

        int index = 0;
        int n = A.size();

        int i=0;
        int j=n-1;
        while (i<n && j>=0){
            if(A.get(i).get(j)==1){
                index = Math.max(index,i);
                j--;
            }else if(A.get(i).get(j)==0){
                i++;
            }
        }
        System.out.println(index);
    }
}
