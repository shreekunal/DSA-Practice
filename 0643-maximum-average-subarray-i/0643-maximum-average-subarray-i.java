class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int avg = 0;
        for(int i = 0; i<k; i++){
            avg += nums[i];
        }
        int maxAvg = avg;
        for(int i = k; i<nums.length; i++){
            avg += nums[i];
            avg -= nums[i-k];
            maxAvg = Math.max(avg, maxAvg);
        }
        return (double)maxAvg/k;
    }
}