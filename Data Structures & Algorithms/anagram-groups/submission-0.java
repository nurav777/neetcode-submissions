class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hashMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            int[] frequency = new int[26];
            for(char c : str.toCharArray()){
                frequency[c-'a']++;
            }
            for(int i=0;i<26;i++){
                int num = frequency[i];
                for(int j=0;j<8;j++){
                    sb.append((num >> j) & 1);
                }
            }
            String encodedKey = sb.toString();
            sb = new StringBuilder();
            if(hashMap.containsKey(encodedKey)){
                List<String> list = hashMap.get(encodedKey);
                list.add(str);
                hashMap.put(encodedKey, list);
            }
            else{
                hashMap.put(encodedKey, new ArrayList<>(List.of(str)));
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry : hashMap.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}
