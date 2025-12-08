package AdvancedDSA.Day2;

import java.util.ArrayList;
import java.util.Arrays;

public class RowWithMaximumOnesApproach1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(0,0,0,0)));
        A.add(new ArrayList<>(Arrays.asList(0,0,0,1)));
        A.add(new ArrayList<>(Arrays.asList(0,0,1,1)));
        A.add(new ArrayList<>(Arrays.asList(0,1,1,1)));

        int row = 0;
        int max = 0;
        for(int i = 0; i < A.size(); i++){
            int sum = 0;
            for(int j = 0; j < A.get(i).size(); j++){
                if(A.get(i).get(j) == 1) sum += A.get(i).get(j);
            }
            if(sum > max){
                max = sum;
                row = i;
            }

        }

        System.out.println(row);
    }
}
