package AdvancedDSA2.Day1;

public class SquareRootApproach1 {
    public static void main(String[] args) {
        int n = 50;
        int ans = 1;
        int i = 1;
        while(i * i <= n){
            ans = i;
            i++;
        }
        System.out.println(ans);
    }
}
