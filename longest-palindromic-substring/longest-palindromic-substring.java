class Solution {
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        String res = "";
        for(int i = 0; i < s.length(); i++) {
            String odd = expandFromMiddle(s, i, i);
            if (odd.length() > res.length()) {
                res = odd;
            }
            String even = expandFromMiddle(s, i, i + 1);
            if(even.length() > res.length()) {
                res = even;
            }
        }
        return res;
    }
    public String expandFromMiddle(String s, int left, int right) {
        if(s == null || left > right) {
            return "";
        }
        
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}