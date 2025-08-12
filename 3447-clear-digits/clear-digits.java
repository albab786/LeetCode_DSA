class Solution {
    public String clearDigits(String s) {    
 Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (!stack.isEmpty()) {
                    stack.pop(); // remove last character
                }
            } else {
                stack.push(c); // add character
            }
        }

        // Convert stack back to string
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }
        
        return result.toString();
    }
}