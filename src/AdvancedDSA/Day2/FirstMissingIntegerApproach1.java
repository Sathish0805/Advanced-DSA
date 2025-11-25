package AdvancedDSA.Day2;

public class FirstMissingIntegerApproach1 {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};

        for(int i=1; i<=arr.length; i++){
            boolean found = false;
            for (int k : arr) {
                if (i == k) {
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println(i);
            }
        }
    }
}
