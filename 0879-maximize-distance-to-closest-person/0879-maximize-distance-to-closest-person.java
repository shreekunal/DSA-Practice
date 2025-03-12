class Solution {
    public int maxDistToClosest(int[] seats) {
        int lstSeat = -1;
        int maxDt = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                if (lstSeat == -1) {
                    maxDt = i;
                } else {
                    maxDt = Math.max(maxDt, (i - lstSeat) / 2);
                }
                lstSeat = i;
            }
        }
        maxDt = Math.max(maxDt, (seats.length - lstSeat - 1));
        return maxDt;
    }
}