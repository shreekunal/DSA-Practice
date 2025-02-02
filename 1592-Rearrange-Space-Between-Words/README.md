Got it! Here's the README file for LeetCode question **1592. Rearrange Spaces Between Words**, formatted in a similar style to the "Two Sum" question:

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

### Code Implementation (Python)

```python
def reorderSpaces(text: str) -> str:
    # Split the text into words
    words = text.split()
    
    # Count total number of spaces in the original string
    total_spaces = text.count(" ")
    
    # If there is only one word, return that word with all spaces at the end
    if len(words) == 1:
        return words[0] + " " * total_spaces
    
    # Calculate the space between words
    space_between = total_spaces // (len(words) - 1)
    
    # Calculate the remaining spaces to be added at the end
    extra_space = total_spaces % (len(words) - 1)
    
    # Join the words with the calculated spaces and return the result
    return (" " * space_between).join(words) + " " * extra_space
```

---

### Complexity Analysis

- **Time Complexity**: \(O(N)\), where \(N\) is the length of the input string. The algorithm iterates over the string to split words, count spaces, and join the words back with the spaces.
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

Let me know if you'd like any adjustments!
