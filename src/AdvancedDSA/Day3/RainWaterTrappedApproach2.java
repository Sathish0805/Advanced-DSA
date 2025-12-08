package AdvancedDSA.Day3;

import java.util.ArrayList;
import java.util.Arrays;

public class RainWaterTrappedApproach2 {
    public static void main(String[] args) {
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0,1,0,2,1,0,1,3,2,1,2,1));
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(4,2,5,7,4,2,3,6,8,2,3));
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0,1,0,2,1,0,1,3,2,1,2,1));
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(4,2,0,3,2,5));
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(5,4,1,2));
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3,0,2,0,4));
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2,0,2));

        int[] LMax = new int[A.size()];
        int[] RMax = new int[A.size()];
        LMax[0] = A.get(0);
        for (int i = 1; i < A.size(); i++) {
            LMax[i] = Math.max(LMax[i - 1], A.get(i));
        }

        RMax[A.size()-1] = A.get(A.size()-1);
        for(int i = A.size()-2; i >= 0; i--){
            RMax[i] = Math.max(RMax[i+1], A.get(i));
        }

        int ans = 0;
        for(int i=1; i<A.size()-1; i++){
            int leftMax = LMax[i-1];
            int rightMax = RMax[i+1];
            int level = Math.min(leftMax, rightMax);
            ans += Math.max(level-A.get(i),0);
        }
        System.out.println(ans);
    }
}
