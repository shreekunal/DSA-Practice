class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] one = new int[n];
        one[0] = nums[0];
        int l1 = 0;

        int[] two = new int[n];
        two[0] = nums[1];
        int l2 = 0;

        for (int i = 2; i < n; i++) {
            if (one[l1] > two[l2])
                one[++l1] = nums[i];
            else
                two[++l2] = nums[i];
        }

        n = 0;
        for (int i = 0; i <= l1; i++) {
            nums[n++] = one[i];
        }
        for (int i = 0; i <= l2; i++) {
            nums[n++] = two[i];
        }
        return nums;
    }
}