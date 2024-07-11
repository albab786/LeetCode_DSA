class Solution {
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