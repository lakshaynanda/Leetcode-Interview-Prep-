class Solution {
    public int getMaximumGenerated(int n) {
        if (n <= 1) {
            return n;
        }
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        int max = Integer.MIN_VALUE;
        for(int i = 2; i <= n; i++) {
            if(i % 2 == 0) {
                dp[i] = dp[i / 2];
                max = dp[i] > max ? dp[i] : max;
            } else {
                dp[i] = dp[i/2] + dp[(i/2) + 1];
                max = dp[i] > max ? dp[i] : max;
            }
        }
        return max;
    }
}