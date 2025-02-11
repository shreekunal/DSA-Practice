class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int arr[] = new int[2];
        for(int i = 0; i<nums.length; i++){
            int c = target - nums[i];
            if(hm.containsKey(c)){
                return new int[]{hm.get(c), i};
            }
            hm.put(nums[i], i);
        }
        return arr;
    }
}