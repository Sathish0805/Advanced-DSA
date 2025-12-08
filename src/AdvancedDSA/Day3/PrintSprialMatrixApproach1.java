package AdvancedDSA.Day3;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintSprialMatrixApproach1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(1,2,3,4,5)));
        A.add(new ArrayList<>(Arrays.asList(6,7,8,9,10)));
        A.add(new ArrayList<>(Arrays.asList(11, 12, 13, 14, 15)));
        A.add(new ArrayList<>(Arrays.asList(16, 17, 18, 19, 20)));
        A.add(new ArrayList<>(Arrays.asList(21, 22, 23, 24, 25)));

        int i = 0,j = 0;

        for(int k = 0; k < A.size()-1; k++){
            System.out.print(A.get(i).get(j) + " ");
            j++;
        }
        for(int k = 0; k < A.size()-1; k++){
            System.out.print(A.get(i).get(j) + " ");
            i++;
        }
        for(int k = 0; k < A.size()-1; k++){
            System.out.print(A.get(i).get(j) + " ");
            j--;
        }
        for(int k = 0; k < A.size()-1; k++){
            System.out.print(A.get(i).get(j) + " ");
            i--;
        }
    }
}
