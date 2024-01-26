class Solution {
    public int missingNumber(int[] nums) {
        int i=0;

        while(i<nums.length){
            int correctpos=nums[i];
            if(nums[i] < nums.length && nums[i]!=nums[correctpos]){
                swap(nums,i,correctpos);
            }else{
                i++;
            }
           
        }
 
    for(int j=0;j<nums.length;j++){
        if(nums[j]!=j){
            return j;
        }
    }
    return nums.length;
    }
       void swap(int nums[], int posA, int posB) {
        int temp = nums[posA];
        nums[posA] = nums[posB];
        nums[posB] = temp;
    }
}