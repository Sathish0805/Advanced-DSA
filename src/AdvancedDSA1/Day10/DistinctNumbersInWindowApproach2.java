package AdvancedDSA1.Day10;

import java.util.Arrays;
import java.util.HashMap;

public class DistinctNumbersInWindowApproach2 {
    public static void main(String[] args) {
        int[]  A = {1, 1, 2, 2};
        int B = 1;
        int[] ans = new  int[A.length-B+1];
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int i = 0; i < B; i++ ){
            map.put(A[i], map.getOrDefault(A[i],0)+1);
        }
        ans[0] = map.size();

        for(int i = B; i < A.length; i++){
            if(map.containsKey(A[i-B])){
                if(map.get(A[i-B]) == 1){
                    map.remove(A[i-B]);
                }else{
                    map.put(A[i-B], map.get(A[i-B]) - 1);
                }
            }
            map.put(A[i], map.getOrDefault(A[i],0)+1);
            ans[i-B+1] = map.size();
        }
        System.out.println(Arrays.toString(ans));
    }
}
