package AdvancedDSA.Day9;

public class CountPairDifferenceApproach1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2};
        int k = 1;

        int count = 0;
        for (int j : arr) {
            for (int value : arr) {
                if (j - value == k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
