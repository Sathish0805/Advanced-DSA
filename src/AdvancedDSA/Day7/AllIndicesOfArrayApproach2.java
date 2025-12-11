package AdvancedDSA.Day7;

import java.util.ArrayList;
import java.util.Arrays;

public class AllIndicesOfArrayApproach2 {
    public static void main(String[] args) {
        ArrayList<Integer> A =new ArrayList<>(Arrays.asList(8, 9, 5, 6, 5, 5));
        int B = 5;
        System.out.println(getIndexes(A,B,0).reversed());
    }
    static ArrayList<Integer> getIndexes(ArrayList<Integer> A, int B, int index){
        if(index==A.size()){
            return new ArrayList<>();
        }
        if(A.get(index)==B){
            ArrayList<Integer> arr = getIndexes(A, B, index+1);
            arr.add(index);
            return arr;
        }else{
            return getIndexes(A, B, index+1);
        }
    }
}
