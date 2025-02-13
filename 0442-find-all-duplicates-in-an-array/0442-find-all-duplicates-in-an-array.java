class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> li = new ArrayList<>();
        for(int num:nums){
            if(!set.add(num)) li.add(num);
        }
        return li;
    }
}