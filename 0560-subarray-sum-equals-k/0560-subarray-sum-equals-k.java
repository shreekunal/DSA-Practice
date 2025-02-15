class Solution {
    public int subarraySum(int[] nums, int k) {
        int prSum = 0, cnt = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        for (int num : nums) {
            prSum += num;
            cnt += hm.getOrDefault(prSum - k, 0);
            hm.put(prSum, hm.getOrDefault(prSum, 0) + 1);
        }
        return cnt;
    }
}