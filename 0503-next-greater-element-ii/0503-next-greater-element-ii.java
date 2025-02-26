class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Stack<Integer> stk = new Stack<>();
        Arrays.fill(ans, -1);
        for (int i = 0; i < n * 2; i++) {
            int num = nums[i % n];
            while (!stk.isEmpty() && nums[stk.peek()] < num) {
                ans[stk.pop()] = num;
            }
            if (i < n)
                stk.push(i);
        }
        return ans;
    }
}