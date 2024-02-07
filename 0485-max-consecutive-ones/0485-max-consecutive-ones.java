class Solution {
     public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }if(nums[i]==0 || i==nums.length-1){
                max=Math.max(count,max);
                count=0;
            }
        }
        return max;
    }
}