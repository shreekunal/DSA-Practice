class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int frq1[] = new int[26];
        int frq2[] = new int[26];
        for (char ch : word1.toCharArray()) {
            frq1[ch - 'a']++;
        }
        for (char ch : word2.toCharArray()) {
            frq2[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            int diff = frq1[i] - frq2[i];
            diff = Math.abs(diff);
            if (diff > 3)
                return false;
        }
        return true;
    }
}