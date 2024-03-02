class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
       for (String element : words) {
  
           if(s.startsWith(element)){
               count++;
           }
    }
    return count; 
    }
}