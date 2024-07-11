class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        for(int i=0;i<ans.length;i++){
             ans[i]=hammingWeight(i);
        }
        return ans;
    }
     public int hammingWeight(int n) {
        int count_bits=0;
        while(n>0){
            if(n%2==1){
                count_bits++;
            }
            n=n/2;
        }
        return count_bits++;
        
    }
}