class Solution {
    public int countDigits(int num) {
        if (num == 0) return 1; 
    
    int count = 0;
    int n = Math.abs(num); 
    while (n > 0) {
        int rem = n % 10;
        if (rem != 0 && num % rem == 0) { 
            count++;
        }
        n = n / 10;
    }
    return count;
        
    }
}