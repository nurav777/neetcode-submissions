class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int target = -nums[i];
            int left = i+1;
            int right = nums.length-1;
            //System.out.println("TARGET -- : " + target);
            while(left<right){
                if(left == i){left++; continue;}
                if(right == i){right--;continue;}
                int curr = nums[left] + nums[right];
                ///System.out.println(nums[left] + " " + nums[right]);
                if(curr == target){
                    List<Integer> one = new ArrayList<>();
                    one.add(-target);
                    one.add(nums[left]);
                    one.add(nums[right]);
                    if(!set.contains(one)){ res.add(one); set.add(one);}
                    left++;
                    right--;
                }
                else if(curr < target){
                    left++;
                }
                else{
                    right--;
                }
            }
            //System.out.println();
        }
        return res;
    }
}
