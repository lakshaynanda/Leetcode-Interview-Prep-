class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if (c != '#') {
                s1.push(c);
            } else if (!s1.isEmpty()) {
                s1.pop();
            }
        }
        for(char c : t.toCharArray()) {
            if (c != '#') {
                s2.push(c);
            } else if (!s2.isEmpty()) {
                s2.pop();
            }
        }
        return String.valueOf(s1).equals(String.valueOf(s2));
    }
}