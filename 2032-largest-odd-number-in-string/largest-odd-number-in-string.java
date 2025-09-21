class Solution {
public int lastOddCharIndex(String num) {
    for (int i = num.length() - 1; i >= 0; i--) {
      
        String str = num.substring(i, i + 1);
        int digit = Integer.parseInt(str);

        if (digit % 2 != 0) {
            return i; 
        }
    }
    return -1; 
}
    public String largestOddNumber(String num) {
       if(lastOddCharIndex(num)==-1){
        return "";
       } 
       return num.substring(0,lastOddCharIndex(num)+1 );
       
    }
}