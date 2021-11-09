class Solution {
    public int calculate(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        char operator = '+';
        for(int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if(Character.isDigit(currentChar)) {
                currentNumber = ((currentNumber) * 10 + (currentChar - '0'));
            }
            if(!Character.isDigit(currentChar) && (!Character.isWhitespace(currentChar)) || i == s.length() - 1) {
                if(operator == '-') {
                    stack.push(-currentNumber);
                } else if (operator == '+') {
                    stack.push(currentNumber);
                } else if (operator == '*') {
                    stack.push(stack.pop() * currentNumber);
                } else if (operator == '/') {
                    stack.push(stack.pop() / currentNumber);
                }
                
                operator = currentChar;
                currentNumber = 0;
            }
        }
        int result = 0;
        while(!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}