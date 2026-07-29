class Solution {
    public int maxSubArray(int[] nums) {
        int totalSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int n : nums){
            currSum += n;
            totalSum = Math.max(totalSum, currSum);
            if(currSum < 0) currSum = 0;
        }
        return totalSum;
    }
}
