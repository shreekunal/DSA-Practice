class Solution {
    public int largestAltitude(int[] gain) {
        int alt = 0;
        int maxAlt = 0;
        for(int x:gain){
            alt+=x;
            maxAlt = Math.max(alt, maxAlt);
        }
        return maxAlt;
    }
}