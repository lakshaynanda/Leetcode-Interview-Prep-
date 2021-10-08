class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> output = new ArrayList<>();
        helper(n, n, "", output);
        return output;
    }
    
    public List<String> helper(int open, int close, String balancedParen, ArrayList<String> output) {
        if (open == 0 && close == 0) {
            output.add(balancedParen);
            return output;
        }
        
        if (open > 0) {
            String openBracket = balancedParen + "(";
            helper(open - 1, close, openBracket, output);
        }
        if (open < close) {
            String closeBracket = balancedParen + ")";
            helper(open, close - 1, closeBracket, output);
        }
        return output;
    }
}