package LeetcodeProblems;

import java.util.Arrays;
import java.util.HashMap;

public class NextGreaterElementI_496_Approach2 {
    public static void main(String[] args) {
//        int[] num1 = {1,3,5,2,4};
//        int[] num2 = {-1,6,5,4,3,2,1,7};

//        int[] num1 = {2,4};
//        int[] num2 = {1,2,3,4};

        int[] num1 = {4,1,2};
        int[] num2 = {1,3,4,2};

        int[] num2Max = new int[num2.length];
        num2Max[num2.length-1] = num2[num2.length-1];
        for (int j = num2.length-2; j >= 0; j--) {
            num2Max[j] = Math.max(num2Max[j+1],num2[j]);
        }
        System.out.println(Arrays.toString(num2Max));

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(num2[num2.length-1], -1);
        for (int i = 0; i < num2.length-1; i++) {
            if(num2[i] < num2[i+1]){
                map.put(num2[i], num2Max[i+1]);
            }else{
                map.put(num2[i], -1);
            }
        }

        int[] ans = new int[num1.length];
        for(int i = 0; i < num1.length; i++){
            ans[i] = map.get(num1[i]);
        }
        System.out.print(Arrays.toString(ans));
    }
}
