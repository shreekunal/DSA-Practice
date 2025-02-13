class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for (int num : hm.keySet()) {
            if (k == 0) {
                if (hm.get(num) > 1)
                    count++;
            } else {
                if(hm.containsKey(num + k)) count++;
            }
        }
        return count;
    }
}