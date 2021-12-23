class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int[] prefix = kmp(s);
        if(prefix[prefix.length - 1] > 0 && (s.length() % (s.length() - prefix[prefix.length - 1])) == 0) {
            return true;
        }
        return false;
    }
    
    public int[] kmp(String s) {
        int prefix[] = new int[s.length()];
        
        int left = 0; int right = 1;
        while(right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                prefix[right] = left;
                right++; 
            } else if (left > 0) {
                left = prefix[left - 1];
            } else {
                right++;
            }
        }
        return prefix;
    }
}