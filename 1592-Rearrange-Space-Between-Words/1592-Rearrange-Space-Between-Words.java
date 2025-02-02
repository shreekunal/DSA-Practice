class Solution {
    public String reorderSpaces(String text) {
        int white = 0;
        // Counting the number of white spaces
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                white++;
        }
        // Splitting the text into words
        String words[] = text.trim().split("\\s+");
        
        // Calculating the number of spaces between words and the extra spaces
        int space = words.length > 1 ? white / (words.length - 1) : 0;
        int extraSpace = words.length > 1 ? white % (words.length - 1) : white;
        
        StringBuilder ans = new StringBuilder();
        
        // Appending the words with spaces
        for (int i = 0; i < words.length; i++) {
            ans.append(words[i]);
            if (i != words.length - 1)
                for (int j = 0; j < space; j++)
                    ans.append(" ");
        }
        
        // Appending the extra spaces
        for (int i = 0; i < extraSpace; i++) ans.append(" ");
         
        return ans.toString();
    }
}