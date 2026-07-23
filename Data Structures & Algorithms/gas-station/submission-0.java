class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] findMaxSubArray = new int[gas.length + 1];
        for(int i=1;i<gas.length+1;i++){
            findMaxSubArray[i] = gas[i-1] - cost[i-1];
        }
        findMaxSubArray[0] = findMaxSubArray[findMaxSubArray.length-1];
        int startIdx = -1;
        int currStart = -1;
        int currSum = 0;
        int maxSum = -1;
        for(int i=0;i<findMaxSubArray.length;i++){
            if(currSum + findMaxSubArray[i] >= 0){
                if(currStart == -1){
                    currStart = i;
                }
                currSum += findMaxSubArray[i];
                if(maxSum < currSum){
                    maxSum = currSum;
                    startIdx = currStart;
                }
            }
            else{
                currSum = 0;
                currStart = -1;
            }
            //System.out.println(currSum);
        }
        if(startIdx==-1) return -1;
        if(startIdx==0){
            startIdx = gas.length-1;
            //System.out.print("Yep");
        }
        else{
            startIdx--;
        }
        int currGas = 0;
        for(int i=startIdx + 1;i<findMaxSubArray.length;i++){
            currGas += findMaxSubArray[i];
            if(currGas < 0) return -1;
        }
        for(int i = 1; i<= startIdx; i++){
            currGas += findMaxSubArray[i];
            if(currGas < 0) return -1;
        }
        return startIdx;
    }
}
