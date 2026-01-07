package AdvancedDSA1.Day8;

public class DeleteOneApproach2 {
    public static void main(String[] args) {

        int[] arr = {12, 15, 18};
        int n = arr.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = gcd(prefix[i - 1], arr[i]);
        }

        suffix[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = gcd(suffix[i + 1], arr[i]);
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            int currGcd;
            if (i == 0)
                currGcd = suffix[1];
            else if (i == n - 1)
                currGcd = prefix[n - 2];
            else
                currGcd = gcd(prefix[i - 1], suffix[i + 1]);

            max = Math.max(max, currGcd);
        }

        System.out.println(max);
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
