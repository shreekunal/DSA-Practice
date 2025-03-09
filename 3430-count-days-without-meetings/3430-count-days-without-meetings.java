class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        int mergedEnd = 0, freedays = 0;
        for (int[] meeting : meetings) {
            int start = meeting[0], end = meeting[1];
            if (start > mergedEnd + 1) {
                freedays += start - (mergedEnd + 1);
            }
            mergedEnd = Math.max(mergedEnd, end);
        }
  
        return freedays+days-mergedEnd;
    }
}
