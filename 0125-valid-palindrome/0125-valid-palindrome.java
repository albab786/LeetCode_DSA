class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
       // StringBuilder ans=new StringBuilder();
       String ans="";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))||Character.isLetter(s.charAt(i))){
              //  ans.append(s.charAt(i));
              ans+=s.charAt(i);
            }
        }
        int n=ans.length()-1;
        for(int i=0;i<ans.length()/2;i++){
            if(ans.charAt(i)!=ans.charAt(n-i)){
                return false;
            }

        }
        return true;
    }
}