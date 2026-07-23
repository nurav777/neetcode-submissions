class Solution {
    public int jump(int[] nums) {
        int l=0;
        int r = 0;
        int count = 0;
        while(r<nums.length-1){
            int farthest = r;
            for(int i=l;i<=r;i++){
                farthest = Math.max(farthest, nums[i] + i);
                //System.out.print(i + " ");
            }
            //System.out.println();
            l = r + 1;
            r = farthest;
            count++;
        }
        return count;
        
    }
}
