class Solution {
    public int maxPower(String s) {
        int len=s.length();
        int count =0;
        int curr=1;
        for(int i=0;i<len;i++){
            if(i<len-1 &&s.charAt(i) == s.charAt(i+1)){
                curr++;
            }
            else{
                if(curr>count){
                    count = curr;
                }
                curr=1;
            }
        }    
        return count;   
    }
}