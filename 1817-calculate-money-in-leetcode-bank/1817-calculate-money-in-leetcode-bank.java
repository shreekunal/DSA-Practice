class Solution {
    public int totalMoney(int n) {
        int savings = 0, day = 1, start = 1;
        while (day <= n) {
            int dailyAmnt = start;
            for (int w = 1; w <= 7 && day <= n; w++) {
                savings += dailyAmnt;
                dailyAmnt++;
                day++;
            }
            start++;
        }
        return savings;
    }
}