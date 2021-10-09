class Solution {
    public boolean divisorGame(int n) {
        boolean dp[] = new boolean[n + 1];
        dp[1] = false;
        for(int i = 2; i < n+1; i++) {
            dp[i] = !dp[i-1];
        }
        return dp[n];
    }
}