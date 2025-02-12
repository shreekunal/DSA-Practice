class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for (int num : nums) {
            if (!st.add(num))
                return num;
        }
        return 0;
    }
}