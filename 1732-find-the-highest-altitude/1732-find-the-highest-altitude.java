class Solution {
    public int largestAltitude(int[] gain) {
        int alt=0;
        int path=0;
        for(int i=0;i<gain.length;i++){
            path+=gain[i];
            if (path > alt) {
          alt = path  ; 
        }
        }
        return alt;
    }
}