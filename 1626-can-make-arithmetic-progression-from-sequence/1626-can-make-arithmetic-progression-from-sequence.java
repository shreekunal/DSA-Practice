class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[0] - arr[1];
        for (int i = 2; i < arr.length; i++) {
            int curr = arr[i-1] - arr[i];
            if(curr!=diff) return false;
        }
        return true;
    }
}