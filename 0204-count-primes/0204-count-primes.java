class Solution {
    public int countPrimes(int n) {
        if (n < 2)
            return 0;
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        int count = 0;
        for (int i = 2; i * i < n; i++) {
            if (prime[i]) {
                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }
        for(boolean p:prime){
            if(p) count++;
        }
        return count;
    }
}