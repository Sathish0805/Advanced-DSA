package AdvancedDSA.Day2;

public class FirstMissingIntegerApproach1 {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        char word = 'a';
        char first = (char) (word - 32);
        System.out.println(first);
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


// A - 65
// a - 97-32 - 63
// Hello -> hELLO
 // H >= 95 => H-32
 // h >=65 <= 90 h+32