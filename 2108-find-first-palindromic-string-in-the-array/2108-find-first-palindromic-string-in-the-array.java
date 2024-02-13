class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String ans="";
            String original=words[i];
            for(int j=0;j<original.length();j++){
                ans=original.charAt(j)+ans;
            }
            if(ans.equals(original)){
                return original;
            }
        }
        return "";
    }
}