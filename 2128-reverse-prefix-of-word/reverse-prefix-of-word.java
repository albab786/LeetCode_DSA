class Solution {
    public String reversePrefix(String word, char ch) {
         Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        boolean found = false;
        for (char c : word.toCharArray()) {
            if (!found) {
                stack.push(c);
                if (c == ch) {
                    // Pop stack to reverse
                    while (!stack.isEmpty()) {
                        result.append(stack.pop());
                    }
                    found = true;
                }
            } else {
                result.append(c);
            }
        }
          if (!found) {
            return word;
        }

        return result.toString();
 
    }
}