class Solution {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int count = 0;
        HashSet<Character> set = new HashSet();
        for(int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
                count += 1;
            } else {
                set.add(s.charAt(i));
            }
        }
        return !set.isEmpty() ? 2 * count + 1: 2 * count;
    }
}