package AdvancedDSA.Day7;

public class LastIndexUsingRecursion {
    public static void main(String[] args) {
        int[] A = {6, 5, 6, 2, 6};
        int B = 6;
        System.out.println(findIndex(A, B, 0, -1));
    }
    static int findIndex(int[] A, int B, int i, int index){
        if(i == A.length) return index;
        if(A[i] == B) index = i;
        return findIndex(A, B, i+1, index);
    }
}
