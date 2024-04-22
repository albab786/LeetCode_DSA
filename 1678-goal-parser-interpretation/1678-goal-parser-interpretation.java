class Solution {
    public String interpret(String command) {
       String ans="";
       for(int i=0;i<command.length();i++){
        if(Character.isAlphabetic(command.charAt(i))){
            ans+=command.charAt(i);
        }
        if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
            ans+="o";
        }
       } 
       return ans;
    }
}