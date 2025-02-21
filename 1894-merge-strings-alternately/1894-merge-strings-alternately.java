class Solution {
    public String mergeAlternately(String word1, String word2) {
        char str[] = new char[word1.length() + word2.length()];
        int i = 0, j = 0, index = 0;
        
        while (i < word1.length() && j < word2.length()) {
            str[index++] = word1.charAt(i++);
            str[index++] = word2.charAt(j++);
        }

        while (i < word1.length())
            str[index++] = word1.charAt(i++);
        
        while (j < word2.length())
            str[index++] = word2.charAt(j++);

        
        return new String(str);
    }
}