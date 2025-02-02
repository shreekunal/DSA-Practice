
```markdown
# LeetCode 1592: Rearrange Spaces Between Words
**Easy**

You are given a string `text` consisting of words separated by **exactly** one space. Your task is to rearrange the spaces so that:

1. The spaces between words are distributed as evenly as possible.
2. If the number of spaces cannot be evenly distributed, the extra spaces should be placed at the end of the string.

### Example 1:
**Input:**
```plaintext
text = "  this   is  a sentence "
```
**Output:**
```plaintext
"this   is   a   sentence"
```
**Explanation:**
- There are `9` spaces and `4` words.
- `9 / (4-1) = 3` spaces between each word.
- No extra spaces at the end.

### Example 2:
**Input:**
```plaintext
text = " practice   makes   perfect"
```
**Output:**
```plaintext
"practice   makes   perfect "
```
**Explanation:**
- There are `7` spaces and `3` words.
- `7 / (3-1) = 3` spaces between each word.
- `7 % (3-1) = 1` extra space at the end.

### Constraints:
- `1 <= text.length <= 100`
- `text` consists of lowercase English letters and spaces `' '`.
- `text` contains at least one word.

---

### Solution Approach

1. **Extract Words**: Use `split()` to separate words while preserving spaces.
2. **Count Spaces**: Count total spaces in the input string.
3. **Distribute Spaces**:
   - If more than one word, divide spaces evenly between words.
   - Any remaining spaces are added at the end.
4. **Reconstruct the String**: Join words with calculated spaces and return the result.

### Code Implementation (Java)

```java
class Solution {
    public String reorderSpaces(String text) {
        // Count the number of spaces in the text
        int white = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') white++;
        }
        
        // Split the text into words
        String words[] = text.trim().split("\\s+");
        
        // Calculate space between words and extra space at the end
        int space = words.length > 1 ? white / (words.length - 1) : 0;
        int ex = words.length > 1 ? white % (words.length - 1) : white;
        
        StringBuilder ans = new StringBuilder();
        
        // Add words with the calculated spaces between them
        for (int i = 0; i < words.length; i++) {
            ans.append(words[i]);
            if (i != words.length - 1)
                for (int j = 0; j < space; j++)
                    ans.append(" ");
        }
        
        // Add any remaining spaces at the end
        for (int i = 0; i < ex; i++) ans.append(" ");
        
        return ans.toString();
    }
}
```

---

### Complexity Analysis

- **Time Complexity**: \(O(N)\), where \(N\) is the length of the input string. The algorithm iterates over the string to count spaces, split words, and build the final string.
- **Space Complexity**: \(O(N)\), as the algorithm stores the words in a list and the reconstructed string in memory.

---

### Test Cases

### Test Case 1:
**Input:**
```plaintext
text = "  this   is  a sentence "
```
**Output:**
```plaintext
"this   is   a   sentence"
```

### Test Case 2:
**Input:**
```plaintext
text = " practice   makes   perfect"
```
**Output:**
```plaintext
"practice   makes   perfect "
```

---

### Summary

This problem is about redistributing spaces between words to make the distribution as even as possible while handling any remaining spaces by placing them at the end of the string. The solution approach focuses on counting spaces, dividing them evenly, and handling extra spaces in the most efficient manner.

---

Happy Coding! 🚀
```
