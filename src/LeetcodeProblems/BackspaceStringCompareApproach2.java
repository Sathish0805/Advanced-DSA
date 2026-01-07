package LeetcodeProblems;

public class BackspaceStringCompareApproach2 {
    // a b # c
    //       i
    static int resolve(String s, int p) {
        int back = 0;

        while (p >= 0) {
            if (s.charAt(p) == '#') {
                back++;
                p--;
            } else if (back > 0) {
                back--;
                p--;
            } else {
                return p;
            }
        }
        return -1;
    }

    static boolean backspaceCompare(String s1, String s2) {
        int p1 = s1.length() - 1;
        int p2 = s2.length() - 1;

        while (p1 >= 0 || p2 >= 0) {
            p1 = resolve(s1, p1);
            p2 = resolve(s2, p2);

            if (p1 < 0 && p2 < 0) return true; // "" == ""
            if (p1 < 0 || p2 < 0) return false;
            if (s1.charAt(p1) != s2.charAt(p2)) return false;

            p1--;
            p2--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "ab#cddd##";
        String s2 = "ad#cd";
        System.out.println(backspaceCompare(s1, s2));
    }
}

/*
    0 1 2 3 4 5 6 7 8
    a b # c d d d # #
            i


    0 1 2 3 4
    a d # c d
            j









    backspace = 0
    a b # c #
          i

    i = 4 => # , bs = bs+1
    i = 3 => c , bs = bs -1 = 0


 */