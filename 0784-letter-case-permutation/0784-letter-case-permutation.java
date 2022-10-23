class Solution {
    public List<String> letterCasePermutation(String s) {
        LinkedList<String> list = new LinkedList<>();
        int n = s.length();
        list.add(s);
        
        for(int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                int size = list.size();
                while(size-- > 0) {
                    String str = list.poll();
                    String left = str.substring(0, i);
                    String right = str.substring(i + 1, n);
                    list.add(left + Character.toUpperCase(c) + right);
                    list.add(left + Character.toLowerCase(c) + right);
                }
            }
        }
        return list;
    }
}