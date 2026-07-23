class Solution {
    public boolean canJump(int[] nums) {
        boolean[] poss = new boolean[nums.length];
        poss[0] = true;
        for(int i=0;i<nums.length;i++){
            if(!poss[i]) continue;
            if(nums[i] == 0) continue;
            for(int j=1;j<=nums[i];j++){
                if(i+j >= nums.length) break;
                poss[i+j] = true;
            }
        }
        return poss[nums.length-1];
    }
}
