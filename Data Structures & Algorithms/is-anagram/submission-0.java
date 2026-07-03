class Solution {
    public boolean isAnagram(String s, String t) {
        int[] frequencyMap = new int[26];
        for(char c : s.toCharArray()){
            frequencyMap[c-'a']++;
        }
        for(char c: t.toCharArray()){
            frequencyMap[c-'a']--;
        }
        for(int i=0;i<26;i++){
            if(frequencyMap[i] != 0) return false;
        }
        return true;
    }
}
