class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int len = (int) Math.floor(Math.log10(num)) + 1;
            if (len % 2 == 0)
                count++;
        }
        return count;
    }
}