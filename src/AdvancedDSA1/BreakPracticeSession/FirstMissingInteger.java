package AdvancedDSA1.BreakPracticeSession;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstMissingInteger {
    public static void main(String[] args) {

        ArrayList <Integer> A = new ArrayList<>(Arrays.asList(3, 4, -1, 1));
        int n = A.size();
        for (int i = 0; i < n; i++) {
            if (A.get(i) <= 0 || A.get(i) > n) {
                A.set(i, n + 1);
            }
        }
        System.out.println(Arrays.toString(A.toArray()));

        for (int i = 0; i < n; i++) {
            int val = Math.abs(A.get(i));
            if (val >= 1 && val <= n) {
                int idx = val - 1;
                if (A.get(idx) > 0) {
                    A.set(idx, -A.get(idx));
                }
            }
        }
        System.out.println(Arrays.toString(A.toArray()));

        for (int i = 0; i < n; i++) {
            if (A.get(i) > 0) {
                System.out.println(i + 1);
            }
        }
        System.out.println(n + 1);
    }
}
