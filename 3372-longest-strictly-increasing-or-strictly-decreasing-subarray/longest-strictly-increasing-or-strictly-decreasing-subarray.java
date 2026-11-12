class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int max = 1, ilen = 1, dlen = 1;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] > nums[i])
                ilen++;
            else
                ilen = 1;

            if (nums[i + 1] < nums[i])
                dlen++;
            else
                dlen = 1;

            max = Math.max(max, Math.max(ilen, dlen));
        }
        return max;
    }
}