class Solution {
    public int leastInterval(char[] tasks, int n) {
        int frq[] = new int[26];
        for (char ch : tasks) {
            frq[ch - 'A']++;
        }
        Arrays.sort(frq);
        int mfrq = frq[25];
        int mfrqc = 0;
        for (int i = 25; i >= 0; i--) {
            if (frq[i] == mfrq)
                mfrqc++;
        }
        return Math.max(tasks.length, (mfrq-1)*(n+1)+(mfrqc));
    }
}