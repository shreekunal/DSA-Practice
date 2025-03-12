class Solution {
    public int findPermutationDifference(String s, String t) {
        int diff = 0;
        for(int i = 0; i<s.length(); i++){
            int index = t.indexOf(s.charAt(i));
            diff += Math.abs(i - index);
        }
        return diff;
    }
}