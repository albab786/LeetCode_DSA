class Solution {
    
     public static int secondHighest(String s) {
        int first=-1;
        int sec=-1;
        String digit="";
        for(int i=0;i<s.length();i++){
            if (Character.isDigit(s.charAt(i))) {
                digit+=s.charAt(i);
            }
        }
        char[] ch = digit.toCharArray();
        if(ch.length==1){
            return -1;
        }
        int[] ints = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            ints[i] = Character.getNumericValue(ch[i]);
        }
        for(int i=0;i<ints.length;i++){
            if(ints[i]>first){
                first=ints[i];
            }
        }
        for(int i=0;i<ints.length;i++){
            if(ints[i]>sec &&  ints[i]<first){
                sec=ints[i];
            }

        }
        return sec;
    }
}