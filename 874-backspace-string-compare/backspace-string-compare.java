class Solution {
    public boolean backspaceCompare(String s, String t) {
         Stack<Character> f1 = new Stack<>();
    Stack<Character> f2 = new Stack<>();

    // Process first string
    for (char c : s.toCharArray()) {
        if (c == '#') {
            if (!f1.isEmpty()) f1.pop();
        } else {
            f1.push(c);
        }
    }

    // Process second string
    for (char c : t.toCharArray()) {
        if (c == '#') {
            if (!f2.isEmpty()) f2.pop();
        } else {
            f2.push(c);
        }
    }

    // Compare contents
    // String s1 = String.valueOf(f1);
    // String s2 = String.valueOf(f2);

    return f1.equals(f2); // Stacks can be directly compared here
    }
}