class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return;
        }
        int nz=0;
        int z=0;
        while(nz!=nums.length){
            if(nums[nz]!=0){
                swap(nums,nz,z);
                nz++;
                z++;

            }else{
                nz++;
            }
            
        }
    }
    void swap(int [] nums ,int first,int last){
        int temp=nums[first];
        nums[first]=nums[last];
        nums[last]=temp;
    }
}