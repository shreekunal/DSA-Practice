class Solution {
    public int maximumValue(String[] strs) {
        int max = Integer.MIN_VALUE;
        for (String s : strs) {
            if (s.matches("\\d+")) {
                int num = Integer.parseInt(s);
                max = Math.max(max, num);
            } else {
                int num = s.length();
                max = Math.max(max, num);
            }
        }
        return max;
    }
}