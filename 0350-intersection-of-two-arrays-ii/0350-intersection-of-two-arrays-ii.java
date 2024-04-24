class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       Arrays.sort(nums1);
       Arrays.sort(nums2);
       int ans []=new int[nums1.length*nums2.length];

       int i=0;
       int j=0;
       int k=0;
       while(i<nums1.length && j<nums2.length){
        if(nums1[i]<nums2[j]){
            i++;
        }else if(nums1[i]>nums2[j]){
            j++;
        }else{
            ans[k]=nums1[i];
            k++;
            i++;
            j++;
        }
       }
       return Arrays.copyOfRange(ans ,0,k);

    }
}