<h2><a href="https://leetcode.com/problems/rearrange-spaces-between-words/">1592. Rearrange Spaces Between Words</a></h2>
<h3>Easy</h3>
<hr>
<div>
<p>You are given a string <code>text</code> consisting of words separated by <strong>exactly</strong> one space. Your task is to rearrange the spaces so that:</p>

<ul>
    <li>The spaces between words are distributed as evenly as possible.</li>
    <li>If the number of spaces cannot be evenly distributed, the extra spaces should be placed at the end of the string.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> text = "  this   is  a sentence "
<strong>Output:</strong> "this   is   a   sentence"
<strong>Explanation:</strong> There are <code>9</code> spaces and <code>4</code> words. Each gap between words gets <code>3</code> spaces. No extra spaces remain.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> text = " practice   makes   perfect"
<strong>Output:</strong> "practice   makes   perfect "
<strong>Explanation:</strong> There are <code>7</code> spaces and <code>3</code> words. Each gap gets <code>3</code> spaces, and there is <code>1</code> extra space at the end.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>
<ul>
    <li><code>1 &lt;= text.length &lt;= 100</code></li>
    <li><code>text</code> consists of lowercase English letters and spaces <code>' '</code>.</li>
    <li><code>text</code> contains at least one word.</li>
</ul>

<p>&nbsp;</p>
<strong>Solution Approach:</strong>
<p>1. Extract words using <code>split()</code> to separate them while handling spaces.</p>
<p>2. Count the total spaces in the input string.</p>
<p>3. Calculate the number of spaces between words and handle any remaining spaces.</p>
<p>4. Reconstruct the string by placing calculated spaces between the words and any remaining spaces at the end.</p>

<p><strong class="example">Code Implementation (Java):</strong></p>
<pre><code>
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
</code></pre>

<p>&nbsp;</p>
<p><strong>Time Complexity:</strong> <code>O(N)</code>, where <code>N</code> is the length of the input string. The algorithm iterates over the string to count spaces, split words, and build the final string.</p>
<p><strong>Space Complexity:</strong> <code>O(N)</code>, as the algorithm stores the words in a list and the reconstructed string in memory.</p>

<p>&nbsp;</p>
<p><strong class="example">Test Case 1:</strong></p>
<pre><strong>Input:</strong> text = "  this   is  a sentence "
<strong>Output:</strong> "this   is   a   sentence"
</pre>

<p><strong class="example">Test Case 2:</strong></p>
<pre><strong>Input:</strong> text = " practice   makes   perfect"
<strong>Output:</strong> "practice   makes   perfect "
</pre>

<p>&nbsp;</p>
<strong>Summary:</strong>
<p>This problem is about redistributing spaces between words to make the distribution as even as possible while handling any remaining spaces by placing them at the end of the string. The solution approach focuses on counting spaces, dividing them evenly, and handling extra spaces in the most efficient manner.</p>

<p>&nbsp;</p>
<p>Happy Coding! 🚀</p>
</div>
