package AdvancedDSA.Day9;

import java.util.HashSet;
// Here we use the on go set which means by checking one by one we are updating the set
// so the same index issue will not occur

public class CheckPairSumApproach4 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 1, 2};
        int K = 5;

        HashSet<Integer> set = new HashSet<>();

        for (int a : arr) {
            int b = K - a;
            if (set.contains(b)) {
                System.out.println("YES");
                break;
            }
            set.add(a);
        }
    }
}
