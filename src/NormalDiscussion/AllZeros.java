package NormalDiscussion;

import java.util.Arrays;

public class AllZeros {
    public static void main(String[] args) {
        int[] arr = {4, 8, 16, 40};

        Arrays.sort(arr);
        int i = 0;
        int index = arr[0];
        int count = 0;
        while (i < arr.length) {
            if (index == 0) {
                i++;
                continue;
            }
            int diff =  arr[i] - index;
            if (diff == 0) {
                i++;
            }else{
                index = diff;
            }
            count++;
        }
        System.out.println(count);
    }
}
