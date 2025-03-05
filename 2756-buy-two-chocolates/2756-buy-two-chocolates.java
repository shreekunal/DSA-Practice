class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int left = 0, right = 1;
        while (right < prices.length) {
            int sum = prices[left] + prices[right];
            if (sum <= money) {
                return money - sum;
            }
            right++;
            left++;
        }
        return money;
    }
}