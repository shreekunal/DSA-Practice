class Solution {
    public static int largestPrime(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        // Sieve of Eratosthenes
        for (int i = 2; i <= n / i; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        int sum = 0;
        int ans = 0;

        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                if (sum + i > n)
                    break;
                sum += i;
            }
            if (prime[sum])
                ans = sum;
        }

        return ans;
    }
}