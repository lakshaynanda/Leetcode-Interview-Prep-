class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(n, n, "", ans);
        return ans;
    }
    public List<String> helper(int open, int close, String balancedString, List<String> ans) {
        if (open == 0 && close == 0) {
            ans.add(balancedString);
            return ans;
        }
        
        if (open > 0) {
            helper(open - 1, close, balancedString + "(", ans);
        }
        if (open < close) {
            helper(open, close - 1, balancedString + ")", ans);
        }
        return ans;
    }
}