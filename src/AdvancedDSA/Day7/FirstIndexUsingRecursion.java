package AdvancedDSA.Day7;

public class FirstIndexUsingRecursion {
    public static void main(String[] args) {
        int[] A = {-3, 5, 6, 2};
        int B = 6;
        System.out.println(findIndex(A, B, 0));
    }
    static int findIndex(int[] A, int B, int i){
        if(i == A.length) return -1;
        if(A[i] == B) return i;
        return findIndex(A, B, i+1);
    }
}
