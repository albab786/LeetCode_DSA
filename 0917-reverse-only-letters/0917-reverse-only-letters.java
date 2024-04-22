class Solution {
    public String reverseOnlyLetters(String s) {
        char arr[] = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            
            if (!Character.isAlphabetic(arr[i])) {
                i++;
            }
            if (!Character.isAlphabetic(arr[j])) {
                j--;
            }
            if (Character.isAlphabetic(arr[i]) && Character.isAlphabetic(arr[j])) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            

        }
        return String.valueOf(arr);
    }
}