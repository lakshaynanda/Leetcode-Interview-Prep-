class Solution {
    public int countBinarySubstrings(String s) {
        int curr = 1;
        int prev = 0;
        int ans = 0;
        
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i - 1) != s.charAt(i)) {
                ans += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            } else {
                curr++;
            }
        }
        return ans + Math.min(prev, curr);
    }
}