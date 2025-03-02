class Solution {
    public int arraySign(int[] nums) {
        int n = 0;
        for (int num : nums) {
            if(num < 0) n++;
            else if(num == 0) return 0;
        }
        if(n%2==0) return 1;
        return -1;
    }
}