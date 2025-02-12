class Solution {
    public int findMinDifference(List<String> timePoints) {
        int inttime[] = new int[timePoints.size()];
        int i = 0;
        for (String time : timePoints) {
            int hh = Integer.parseInt(time.substring(0, 2));
            int mm = Integer.parseInt(time.substring(3, 5));
            int convertedtime = hh * 60 + mm;
            inttime[i] = convertedtime;
            i++;
        }
        Arrays.sort(inttime);
        int min = Integer.MAX_VALUE;
        for (i = 1; i < inttime.length; i++) {
            int diff = inttime[i] - inttime[i - 1];
            min = Math.min(min, diff);
        }
        int cirdiff = (inttime[0] + 1440) - inttime[inttime.length - 1];
        min = Math.min(min, cirdiff);
        return min;
    }
}