package LeetcodeProblems;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String[] A = {"h","e","l","l","o"};
        reverseString(A);
        System.out.println(Arrays.toString(A));
    }
    static void reverseString(String[] A){
        int start = 0;
        int end = A.length-1;
        while(start<end){
            String temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
    }
}
