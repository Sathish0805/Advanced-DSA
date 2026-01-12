package LeetcodeProblems;

import java.util.Arrays;

public class NextGreaterElementI_496 {
    public static void main(String[] args) {
//        int[] num1 = {1,3,5,2,4};
//        int[] num2 = {6,5,4,3,2,1,7};

//        int[] num1 = {2,4};
//        int[] num2 = {1,2,3,4};

        int[] num1 = {4,1,2};
        int[] num2 = {1,3,4,2};

        int[] ans = new int[num1.length];

        for(int i = 0; i < num1.length; i++){
            int max = -1;
            boolean flag = false;
            for( int j = 0; j < num2.length; j++){
                if(num1[i] == num2[j]){
                    flag = true;
                }
                if(flag){
                    if(j == num2.length-1){
                        continue;
                    } else if (num1[i] > num2[j+1]) {
                        continue;
                    } else if(num1[i] < num2[j+1]){
                        max = num2[j+1];
                        break;
                    }
                }
            }
            ans[i] = max;
        }
        System.out.println(Arrays.toString(ans));

    }
}
