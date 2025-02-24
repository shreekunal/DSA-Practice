class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int num : nums) {
            int currS = result.size();
            for (int i = 0; i < currS; i++) {
                List<Integer> oldRes = new ArrayList<>(result.get(i));
                oldRes.add(num);
                result.add(oldRes);
            }
        }
        return result;
    }
}