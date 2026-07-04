class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int n : nums){
            countMap.put(n,countMap.getOrDefault(n,0) + 1);
        }
        List<List<Integer>> reverseCountMap = new ArrayList<>();
        for(int i=0;i<=nums.length;i++){
            reverseCountMap.add(new ArrayList<>());
        }
        for(Map.Entry<Integer,Integer> entry : countMap.entrySet()){
            int num = entry.getKey();
            int count = entry.getValue();
            reverseCountMap.get(count).add(num);
        }
        int[] res = new int[k];
        int length = 0;
        for(int i=reverseCountMap.size()-1;i>=0;i--){
            if(reverseCountMap.get(i) == null) continue;
            List<Integer> topElements = reverseCountMap.get(i);
            for(int j=0;j<topElements.size();j++){
                res[length++] = topElements.get(j);
                if(length==k){
                    return res;
                }
            }
        }
        return res;
    }
}
