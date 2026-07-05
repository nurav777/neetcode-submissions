class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] lhs = new int[n];
        int[] rhs = new int[n];
        lhs[0] = 1;
        rhs[n-1] = 1;
        for(int i=1;i<n;i++){
            lhs[i] = lhs[i-1] * nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            rhs[i] = rhs[i+1] * nums[i+1];
        }
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i] = lhs[i] * rhs[i];
        }
        return res;
    }
}  
