class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if (sLen == 0) {
            return true;
        }
        int dp[][] = new int[sLen + 1][tLen + 1];
        
        for(int col = 1; col <= tLen; col++) {
            for(int row = 1; row <= sLen; row++) {
                if (s.charAt(row - 1) == t.charAt(col - 1)) {
                    dp[row][col] = dp[row - 1][col - 1] + 1;
                } else {
                    dp[row][col] = Math.max(dp[row][col - 1], dp[row - 1][col]);
                }
            }
            if (dp[sLen][col] == sLen) {
                return true;
            }
        }
        return false;
    }
}