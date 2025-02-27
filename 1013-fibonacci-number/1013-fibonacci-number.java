class Solution {
    public int fib(int n) {
        // if(n<=1) return n;
        // int a = 0, b = 1, ans = 0;
        // for(int i = 2; i<=n; i++){
        //     ans = a + b;
        //     a = b;
        //     b = ans;
        // }
        // return ans; //brute force
        // return fib(n-1)+fib(n-2); // recursion
        if(n <= 1) return n;
        int arr[] = new int[n + 1];
        Arrays.fill(arr, -1);
        arr[0] = 0;
        arr[1] = 1;
        return help(arr, n); 
    }

    public int help(int arr[], int n){
        if(arr[n]!=-1) return arr[n];
        arr[n] = help(arr, n-1)+help(arr, n-2);
        return arr[n];
    }
}
