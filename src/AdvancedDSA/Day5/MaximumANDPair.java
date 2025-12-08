package AdvancedDSA.Day5;

public class MaximumANDPair {
    public static void main(String[] args) {
        int[] arr = {21, 18, 24, 17, 16};
        int ans = 0;
        for(int i=31; i>=0; i--){
            int count = 0;
            for (int k : arr) {
                if ((k & (1 << i)) != 0) {
                    count++;
                }
            }
            if (count >= 2) {
                ans = ans | (1 << i);
                for(int j=0; j<arr.length; j++){
                    if((arr[j] & (1 << i)) == 0){
                        arr[j] = 0;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
