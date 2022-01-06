class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        
        if (n == 0) {
            return 0;
        }
        if (n > m) {
            return -1;
        }
        
        for(int i = 0; i < m - n; i++) {
            if(haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        if (haystack.substring(m - n).equals(needle)) {
            return m - n;
        }
        return -1;
    }
}