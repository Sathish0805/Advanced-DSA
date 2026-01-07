package AdvancedDSA1.BreakPracticeSession;

public class RainWaterTrapped {
    public static void main(String[] args) {
        int[] A = {2, 4, 8, 2, 7, 3, 6, 8, 4, 7 , 3, 6 , 8, 4, 3};

        int[] leftMax  = new int[A.length];
        int[] rightMax = new int[A.length];
        leftMax[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], A[i]);
        }
        rightMax[A.length - 1] = A[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], A[i]);
        }

        int ans = 0;
        for(int i = 1; i < A.length-1; i++){
            int left =  leftMax[i-1];
            int right = rightMax[i+1];
            int level = Math.min(left, right);
            ans += Math.max(level - A[i], 0);
        }
        System.out.println(ans);
    }
}
