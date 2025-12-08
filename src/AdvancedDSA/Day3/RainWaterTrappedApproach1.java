package AdvancedDSA.Day3;

import java.util.ArrayList;
import java.util.Arrays;

public class RainWaterTrappedApproach1 {
    public static void main(String[] args) {
        long start = System.nanoTime();



        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0,1,0,2,1,0,1,3,2,1,2,1));

        int sum = 0;

        for (int i = 1; i < A.size() - 1; i++) {
            int maxLeft = findMAx(A, 0, i - 1);
            int maxRight = findMAx(A, i + 1, A.size() - 1);

            int waterLevel = Math.min(maxLeft, maxRight);

            if (waterLevel > A.get(i))
                sum += waterLevel - A.get(i);
        }

        System.out.println(sum);

        long end = System.nanoTime();
        System.out.println("Execution time: " + (end - start) + " ns");
        System.out.println("Execution time: " + (end - start) / 1_000_000 + " ms");

    }

    static int findMAx(ArrayList<Integer> A, int i, int j){
        int max = Integer.MIN_VALUE;
        while (i <= j){
            max = Math.max(max, A.get(i));
            i++;
        }
        return max;
    }


}
