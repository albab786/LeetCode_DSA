class Solution {
    public boolean hasAlternatingBits(int n) {
         
        while(n>0){
            int store=n%2;
            n=n/2;
            int store2=n%2;
            if(store == store2){
                return false;
            }
            
            
        }
        return true;
    }
}