class Solution {
    public long pickGifts(int[] gifts, int k) {
        for (int i = 0; i < k; i++) {
            int maxIndex = 0;
            for (int j = 0; j < gifts.length; j++) {
                if (gifts[maxIndex] < gifts[j])
                    maxIndex = j;
            }
            gifts[maxIndex] = (int) Math.sqrt(gifts[maxIndex]);
        }
        long sum = 0;
        for (int num : gifts)
            sum += num;
        return sum;
    }
}