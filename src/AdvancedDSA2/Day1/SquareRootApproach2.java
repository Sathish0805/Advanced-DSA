package AdvancedDSA2.Day1;

public class SquareRootApproach2 {
    public static void main(String[] args) {
        int n = 100;

        if(n == 0) System.out.println(0);

        int ans = 1;
        int low = 1;
        int high = n;

        while(low <= high){
            int mid = low + (high - low)/2;
            if ((long)mid * mid <=  n ) {
                ans = mid;
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
