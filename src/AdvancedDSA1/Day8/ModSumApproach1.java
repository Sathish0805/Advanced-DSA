package AdvancedDSA1.Day8;

public class ModSumApproach1 {
    public static void main(String[] args) {
        int arr[] = {17, 100, 11};
        int sum = 0;
        for (int k : arr) {
            for (int i : arr) {
                sum += k % i;
            }
        }
        System.out.println(sum);
    }
}
