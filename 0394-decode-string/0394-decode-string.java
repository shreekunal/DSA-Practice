class Solution {
    public String decodeString(String s) {
        StringBuilder currStr = new StringBuilder();
        Stack<Integer> cntStk = new Stack<>();
        Stack<StringBuilder> strStk = new Stack<>();
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 +(ch - '0');
            }
            else if(ch == '['){
                cntStk.push(num);
                strStk.push(currStr);
                currStr = new StringBuilder();
                num = 0;
            }
            else if(ch == ']'){
                int rcnt = cntStk.pop();
                StringBuilder decoded = strStk.pop();
                for(int j = 0; j<rcnt; j++){
                    decoded.append(currStr);
                }
                currStr = decoded;
            }
            else currStr.append(ch);
        }
        return currStr.toString();
    }
}