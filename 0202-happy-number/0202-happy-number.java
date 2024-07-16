class Solution {
    public boolean isHappy(int n) {
        while(n>9){
            int sum=0;
            while(n>0){
                int rem=n%10;
                sum=sum+rem*rem;
                n=n/10;
            }
            n=sum;
        }
        return n==1|| n==7;
    }
}