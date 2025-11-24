package LeetcodeProblems;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {

//        int[] nums= {2,3,1,2,4,3};
//        int target=7;

        int[] nums= {5,1,3,5,10,7,4,9,2,8};
        int target=15;

        int[] pf = new int[nums.length];
        pf[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            pf[i] = nums[i] + pf[i-1];
        }

        int minLength = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                int sum = pf[j] - (i > 0 ? pf[i-1] : 0);

                if(sum >= target){
                    int length = j - i + 1;
                    minLength = Math.min(minLength, length);
                }
            }
        }

        System.out.println(minLength == Integer.MAX_VALUE ? 0 : minLength);

    }
}
