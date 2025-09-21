class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        List<String> ans = new ArrayList<>();
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (!str.isEmpty()) {       // add word if it's not empty
                    ans.add(str);
                    str = "";
                }
            } else {
                str = str + s.charAt(i);    // build word
            }
        }

        // add the last word
        if (!str.isEmpty()) {
            ans.add(str);
        }

        // build result in reverse order
        String st = "";
        for (int i = ans.size() - 1; i >= 0; i--) {
            st += ans.get(i) + " ";
        }

        return st.trim();
    }
}
