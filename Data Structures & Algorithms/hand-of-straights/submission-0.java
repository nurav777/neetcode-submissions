class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        for(int num : hand){
            minimum = Math.min(minimum, num);
            maximum = Math.max(maximum,num);
        }
        int[] freq = new int[maximum-minimum + 1];
        for(int num : hand){
            freq[num - minimum]++;
        }
        //for(int num : freq){
            //System.out.println(num);
        //}
        int startIdx = 0;
        while(startIdx < freq.length){
            while(startIdx < freq.length && freq[startIdx] == 0) startIdx++;
            if(startIdx == freq.length) return true;
            int currIdx = startIdx;
            if(currIdx + groupSize > freq.length) return false;
            for(int i=currIdx;i<currIdx + groupSize;i++){
                if(freq[i] == 0) return false;
                freq[i]--;
            }
            //System.out.println();
            //for(int num : freq){
            //System.out.println(num);
            //}
        }
        return true;
    }
}
