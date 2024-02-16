class Solution {
    public boolean isAnagram(String s, String t) {
         HashMap<Character,Integer> ans=new HashMap<>();
         if(s.length()!=t.length()){
             return false;
         }
         for(int i=0;i<s.length();i++){
            ans.put(s.charAt(i),ans.getOrDefault(s.charAt(i),0)+1);
            ans.put(t.charAt(i),ans.getOrDefault(t.charAt(i),0)-1);
        }
        for(char c:ans.keySet()){
            if(ans.get(c)!=0){return false;}
        }
        
        return true;
    }
}