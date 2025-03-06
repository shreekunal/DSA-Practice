class Solution {
    public int totalMoney(int n) {
        int sum = 0, i = 1, j = 1;
        while (i <= n) {
            int k = j;
            for (int w = 1; w <= 7 && i<=n; w++) {
                sum += k;
                k++;
                i++;
            }
            j++;
        }
        return sum;
    }
}