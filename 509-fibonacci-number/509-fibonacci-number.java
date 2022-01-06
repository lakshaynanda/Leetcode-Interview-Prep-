class Solution {
    public int fib(int n) {
        // if (n <= 1) {
        //     return n;
        // }
        // int sum = 0;
        // int it1 = 1;
        // int it2 = 0;
        // for(int i = 2; i <= n; i++) {
        //     sum = it1 + it2;
        //     it2 = it1;
        //     it1 = sum;
        // }
        // return sum;
        // if (n <= 1) {
        //     return n;
        // }
        // int []dp = new int[n + 1];
        // dp[1] = 1;
        // for(int i = 2; i <= n; i++) {
        //     dp[i] = dp[i - 1] + dp[i - 2]; 
        // }
        // return dp[n];
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}