class Solution {
    public int maxRepeating(String sequence, String word) {
        
        String find=word;
        int count=0,beg=0;
        while(true){
            int idx=sequence.substring(beg).indexOf(find);
            if(idx==-1){
                return count;
            }else{
                count++;
                find+=word;
                beg=idx;
            }
        }
         }
    }