class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        for(char ch: s.toCharArray()) {
            if(ch == '(') {
                stack.push(0);
            } else {
                int v = stack.pop();
                int u = stack.pop();
                
                stack.push(u + Math.max(2*v, 1));
            }
        }
        return stack.pop();
    }
}