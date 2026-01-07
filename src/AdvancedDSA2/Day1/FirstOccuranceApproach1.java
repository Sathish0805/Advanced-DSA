package AdvancedDSA2.Day1;

public class FirstOccuranceApproach1 {
    public static void main(String[] args) {
        int[] arr = {-5, -5, -3, 0, 0, 1, 1, 1, 5, 6, 7};
        int k = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                System.out.println(i);
                break;
            }
        }
    }
}
