class Solution {
    public int distributeCandies(int[] candyType) {
        int type=candyType.length/2;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            set.add(candyType[i]);
        }
        if(set.size()>=type){
            return type;
        }
        return set.size();
    }
}