class Solution {
    public int thirdMax(int[] nums) {
      Set<Integer>set=new HashSet<>();
      for(int i=0;i<nums.length;i++){
          set.add(nums[i]);
      }
      int arr[]=new int[set.size()];
      int count=0;
        for (int element : set) {
        arr[count]=element;
        count++;
  
    } 
    Arrays.sort(arr);
    if(arr.length<3){
        return arr[arr.length-1];
    }
    return arr[arr.length-3];
    }
}