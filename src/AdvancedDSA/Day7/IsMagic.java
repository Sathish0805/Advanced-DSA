package AdvancedDSA.Day7;

public class IsMagic {
    public static void main(String[] args) {
        int n = 83557;
        int result = isMagic(n);
        System.out.println(result);
        System.out.println(result == 1);

    }
    static int  isMagic(int n){
        if(n < 10) return n;

        int sum = 0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }

        return isMagic(sum);
    }
}
