class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char ch[] = s.toCharArray();
        st.push(ch[0]);
        
        for(int i = 1; i < ch.length; i++) {
            if (!st.isEmpty() && st.peek() == '(' && ch[i] == ')') {
                st.pop();
            } else if(!st.isEmpty() && st.peek() == '[' && ch[i] == ']') {
                st.pop();
            } else if (!st.isEmpty() && st.peek() == '{' && ch[i] == '}') {
                st.pop();
            } else {
                st.push(ch[i]);
            }
        }
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}