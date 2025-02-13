class Solution {
    public boolean checkPowersOfThree(int n) {
        if(n == 0) return true;  // Base case: If n reduces to 0, it's valid.
        if(n % 3 == 2) return false;  // If remainder is 2, n cannot be formed using 3^x.
        return checkPowersOfThree(n / 3);
    }
}
