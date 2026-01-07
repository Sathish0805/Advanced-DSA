package LeetcodeProblems;

// 1. find the index of the ch in the word.
// 2. if ch not found return same string
// 3. reverse the characters from index to 0
// 4. return word

/*
    a b c d e f g
    0     3

    i = 0 => j = 3

* */

public class ReversePrefixOfWordApproach1 {
    public static void main(String[] args) {
        String word = "abcdefg";
        char ch = 'd';

        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            if(ch == word.charAt(i)){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("not found");
        }

        char[] arr = word.toCharArray();
        int i = 0, j = index;
        while( i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(new String(arr));
    }
}

