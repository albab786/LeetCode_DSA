class Solution {
    public String removeDuplicates(String s) {
             Stack<Character> dummy=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            if (!dummy.isEmpty() && dummy.peek() == c1) {
                dummy.pop(); // remove the duplicate
            } else {
                dummy.push(c1); // keep character
            }
        }
        StringBuilder sb = new StringBuilder();
    for (char c : dummy) {
        sb.append(c);
    }
    return sb.toString();
    }
}