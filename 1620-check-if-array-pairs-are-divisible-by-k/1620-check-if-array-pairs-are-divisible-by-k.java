class Solution {
    public boolean canArrange(int[] arr, int k) {
        int remcnt[] = new int[k];
        for (int num : arr) {
            int rem = ((num % k) + k) % k;
            remcnt[rem]++;
        }
        if (remcnt[0] % 2 != 0)
            return false;
        for (int i = 1; i < k; i++) {
            if(remcnt[i]!=remcnt[k-i]) return false;
        }
        return true;
    }
}