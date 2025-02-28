class Solution {
    public int firstMissingPositive(int[] nums) {
        int miss = 1;
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (n > 0)
                set.add(n);
        }
        while(set.contains(miss)) miss++;
        return miss;
    }
}