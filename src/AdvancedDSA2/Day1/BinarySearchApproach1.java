package AdvancedDSA2.Day1;

public class BinarySearchApproach1 {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12, 14, 19, 20, 23, 25, 27};
        int k = 20;

        for (int i = 0; i < arr.length; i++ ) {
            if (arr[i] == k) {
                System.out.println(i);
            }
        }
    }
}
