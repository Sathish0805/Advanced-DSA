package AdvancedDSA.Day5;

public class SubarraysWithOR1 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0};
        int n  = arr.length ;
        int ans  = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
                continue;
            }else{
                ans += (count * (count + 1)) / 2;
                count = 0;
            }
        }
        ans += (count * (count + 1)) / 2;
        int sum = (n*(n+1))/2;
        System.out.println(sum-ans);
    }
}
