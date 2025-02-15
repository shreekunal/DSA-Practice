class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        Integer ans[] = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        Arrays.sort(ans, (a, b) -> {
            int frq1 = hm.get(a);
            int frq2 = hm.get(b);
            if (frq1 != frq2)
                return Integer.compare(frq1, frq2);
            return Integer.compare(b, a);
        });
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans[i];
        }
        return nums;
    }
}