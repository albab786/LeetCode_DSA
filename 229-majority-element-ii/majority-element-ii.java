class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<> ();
        if(nums.length==1){
         ans.add(nums[0]);
         return ans;
        }
      HashMap<Integer,Integer> list = new HashMap<>();

        // ✅ Count frequency (including itself)
        for (int num : nums) {
            list.put(num, list.getOrDefault(num, 0) + 1);
        }

        // ✅ Check > n/3
        for (Map.Entry<Integer,Integer> entry : list.entrySet()) {
            if (entry.getValue() > nums.length/3) {
                ans.add(entry.getKey());
            }
        }

        return ans;
    }
}