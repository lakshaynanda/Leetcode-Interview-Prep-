class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> braces = new Stack<>();
        HashSet<Integer> indexToRemove = new HashSet<>();
        
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                braces.add(i);
            } else if(s.charAt(i) == ')') {
                if(braces.isEmpty()) {
                    indexToRemove.add(i);
                } else {
                    braces.pop();
                }
            }
        }
        while(!braces.isEmpty()) {
            indexToRemove.add(braces.pop());
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(!indexToRemove.contains(i)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}