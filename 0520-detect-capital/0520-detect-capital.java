class Solution {
    public boolean detectCapitalUse(String word) {
        char[] ch = word.toCharArray();
        if(ch.length==1){
            return true;
        }
  int cap=0;
  int small=0;
  for(int i=0;i<ch.length;i++){
      if(Character.isUpperCase(ch[i])){
          cap++;
      }
      if(Character.isLowerCase(ch[i])){
          small++;
      }
  }
  if(ch.length==cap || ch.length==small || Character.isUpperCase(ch[0]) && ch.length-1==small){
      return true;
  }
  return false;

}
}