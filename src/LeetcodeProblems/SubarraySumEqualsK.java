package LeetcodeProblems;

public class SubarraySumEqualsK {
    public static void main(String[] args) {

        int[] nums= {1,2,3};
        int k=3;

        int count = 0;

        for(int i=0; i<nums.length; i++){
            int currSum = 0;
            for(int j=i; j<nums.length; j++){
                currSum += nums[j];
                if(currSum == k){
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
