class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int ls1 = s1.length();
        int ls2 = s2.length();
        int ls3 = s3.length();
        int ml = Math.min(ls1, Math.min(ls2, ls3));
        int count = 0;

        for (int i = 0; i < ml; i++) {
            if (s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) {
                count++;
            } else
                break;
        }

        if (count == 0)
            return -1;

        return (ls1 - count) + (ls2 - count) + (ls3 - count);
    }
}