package AdvancedDSA.Day9;

import java.util.HashSet;
// This approach is wrong because the condition i!=j same should be considered
// but here it will take the same index

public class CheckPairSumApproach3 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 1, 2};
        int K = 10;
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr) {
            set.add(j);
        }
        System.out.println(set);

        for (int a : arr) {
            int b = K - a;
            if (set.contains(b)) {
                System.out.println(true);
                break;
            }
        }
    }
}
