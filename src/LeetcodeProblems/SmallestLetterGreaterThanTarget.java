package LeetcodeProblems;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char [] letters = {'c','f','j'};
        char target = 'a';
        int i = 0;
        int j = letters.length-1;

        while(i <= j){
            int mid = i + (j-i)/2;
            if((int)letters[mid] > (int)target){
                j = mid-1;
            }else {
                i = mid+1;
            }
        }
        if (i == letters.length){
            System.out.println(letters[0]);
        }else{
            System.out.println(letters[i]);
        }


    }
}
