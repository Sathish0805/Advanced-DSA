package LeetcodeProblems;
// 1. find the index and add them in the string

public class ReversePrefixOfWordApproach2 {
    public static void main(String[] args) {
        String word = "abcdefg";
        char ch = 'd';


        String ans = "";
        int index = -1;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ch){
                index = i;
                break;
            }
        }

        if(index == -1){
            System.out.println("not found");
        }

        for(int i = index; i >= 0; i--){
            ans = ans + word.charAt(i);
        }

        for(int j = index+1; j < word.length(); j++){
            ans = ans + word.charAt(j);
        }
        System.out.println(ans);
    }
}

//String word = "abcdefg";
//char ch = 'd';


//        var reversePrefix = function(word, ch) {
//        let index = word.indexOf(ch);          =>    3
//            if(index === -1) return word;
//
//        let reversed = "";
//               for(let i = index; i >= 0; i--){
//                      reversed += word[i];    =>     d c b a   => dcba
//                }
//            const result = reversed + word.slice(index + 1); abcdefg => efg
//            return result;                                   0123456
//        };