package AdvancedDSA.Day7;

public class TowerOfHanoiApproach1 {
    public static void main(String[] args) {
        int n = 2;
        towerOfHanoi(n, 1, 2, 3);
    }
    static void towerOfHanoi(int n, int a, int b, int c) {
        if(n==0) return;
        towerOfHanoi(n-1, a, c, b);
        System.out.println(n + " -> " + a + " -> " + c);
        towerOfHanoi(n-1, b, a, c);
    }
}
