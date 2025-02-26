class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int num = 0;
        char op = '+';
        s = s.replaceAll("\\s+", "");
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            if (!Character.isDigit(ch) || i == s.length() - 1) {
                if (op == '+') stk.push(num);
                else if (op == '-') stk.push(-num);
                else if (op == '*') stk.push(stk.pop() * num);
                else if (op == '/') stk.push(stk.pop() / num);
                op = ch;
                num = 0;
            }
        }
        int res = 0;
        while (!stk.isEmpty()) {
            res += stk.pop();
        }
        return res;
    }
}