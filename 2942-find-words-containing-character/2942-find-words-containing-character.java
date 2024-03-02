class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> ans=new ArrayList<>();
        String s = Character.toString(x); 
        int count=-1;
        for(String element :words){
            count++;
            if(element.contains(s)){
                ans.add(count);
            }
        }
        return ans;
    }
}