class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        String st = Integer.toString(x);
        int len = st.length();

        for (int i = 0; i < len / 2; i++) {
            if(st.charAt(i)!=st.charAt(len-i-1)) return false;
        }
        return true;
    }
}
