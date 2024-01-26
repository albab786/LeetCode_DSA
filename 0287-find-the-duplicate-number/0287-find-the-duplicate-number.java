class Solution {
    public int findDuplicate(int[] nums) {
      int i=0;
      while(i<nums.length){
          int correctPos=nums[i];
          if(nums[i]!=nums[correctPos]){
              swap(nums,i,correctPos);
          }else{
              i++;
          }
      }
      for(int j=0;j<nums.length;j++){
          if(nums[j]!=j){
              return nums[j];
          }
          
      }
      return nums.length;  
    }
    void swap(int nums[],int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}