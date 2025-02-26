class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Stack<Integer> stk = new Stack<>();
        for(int num:nums2){
            while(!stk.isEmpty()&&stk.peek()<num){
                hm.put(stk.pop(), num);
            }
            stk.push(num);
        }
        int result[] = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            result[i] = hm.getOrDefault(nums1[i], -1);
        }
        return result;
    }
}