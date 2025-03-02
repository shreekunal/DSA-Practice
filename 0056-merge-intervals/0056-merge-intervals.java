class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int []> merged = new ArrayList<>();
        int curr[] = intervals[0];
        for(int i =1; i < intervals.length; i++){
            if(intervals[i][0] <= curr[1]){
                curr[1] = Math.max(intervals[i][1], curr[1]);
            } else{
                merged.add(curr);
                curr = intervals[i];
            }
        }
        merged.add(curr);
        return merged.toArray(new int[merged.size()][]);
    }
}