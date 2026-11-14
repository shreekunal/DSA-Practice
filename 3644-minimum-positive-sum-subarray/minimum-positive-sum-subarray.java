class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + l - 1; j < n && j <= i + r - 1; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums.get(k);
                }
                if (sum > 0) minSum = Math.min(minSum, sum);
            }
        }
        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}