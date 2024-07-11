class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int count_set_bits=countSetBits(i);
            if(checkPrime(count_set_bits)){
               count++;
            }
        }
        return count;
    }
    public int countSetBits(int n) {
        int count_bits=0;
        while(n>0){
            if(n%2==1){
                count_bits++;
            }
            n=n/2;
        }
        return count_bits++;
        
    }
    public boolean checkPrime(int n){
       
        if (n <= 1)
            return false;
 
        if (n == 2 || n == 3)
            return true;
 
        if (n % 2 == 0 || n % 3 == 0)
            return false;
 
        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
 
        return true;
    }
}