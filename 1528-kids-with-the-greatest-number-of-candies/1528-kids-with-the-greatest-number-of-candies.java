class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int mx = Integer.MIN_VALUE;
        for (int c : candies) {
            if (c > mx) {
                mx = c;
            }
        }
        List<Boolean> ans = new ArrayList<>();
        for (int c : candies) {
            ans.add(c + extraCandies >= mx);
        }
        return ans;
    }
}