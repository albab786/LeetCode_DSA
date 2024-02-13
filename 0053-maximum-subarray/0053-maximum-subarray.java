class Solution {
    public int maxSubArray(int[] arr) {
         int currSum=0;
        int maxsum=arr[0];
        if(arr.length==1){
            return arr[0];
        }
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum>maxsum){
                maxsum=currSum;
            }if(currSum<0){
                currSum=0;
            }
        }
        return maxsum;
    }
}