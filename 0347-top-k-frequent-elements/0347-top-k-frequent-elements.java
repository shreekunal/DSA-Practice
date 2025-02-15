import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        int[] ans = new int[k];
        Integer NUM[] = new Integer[hm.size()];
        int i = 0;
        for(int num:hm.keySet()){
            NUM[i] = num;
            i++;
        }
        Arrays.sort(NUM, (a, b)->Integer.compare(hm.get(b),hm.get(a)));
        for(i =0; i<k; i++){
            ans[i] = NUM[i];
        }
        return ans;
    }
}
