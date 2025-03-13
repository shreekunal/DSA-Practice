class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum = 0;
        int len = nums.length;

        int rsum[] = new int[len];
        int point = len - 2;
        for (int i = len - 1; i > 0; i--) {
            sum += nums[i];
            rsum[point--] = sum;
        }

        int lsum[] = new int[len];
        point = 1;
        sum = 0;
        int diff = 0;
        for (int i = 0; i < len - 1; i++) {
            sum += nums[i];
            lsum[point++] = sum;
            nums[diff] = Math.abs(lsum[diff] - rsum[diff++]);
        }
        nums[diff] = Math.abs(lsum[diff] - rsum[diff++]);

        return nums;
    }
}