class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        int n=num/2;
        while(n>0){
            if(n*n==num){
                return true;
            }
            n--;
        }
        return false;
    }
}