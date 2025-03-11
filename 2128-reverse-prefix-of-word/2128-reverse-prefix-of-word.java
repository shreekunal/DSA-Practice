class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stk = new Stack<>();
        StringBuilder ans = new StringBuilder();
        boolean found = false;
        for (char c : word.toCharArray()) {
            if (!found)
                stk.push(c);
            else
                ans.append(c);
            if (c == ch && !found) {
                while (!stk.isEmpty()) {
                    ans.append(stk.pop());
                }
                found = true;
            }
        }
        if (found)
            return ans.toString();
        else
            return word;
    }
}