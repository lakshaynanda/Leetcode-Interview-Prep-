class Solution {
    public String breakPalindrome(String palindrome) {
        int length = palindrome.length();
        
        if (length == 1) {
            return "";
        }
        char[] palin = palindrome.toCharArray();
        for(int i = 0; i < length/2; i++) {
            if (palin[i] != 'a') {
                palin[i] = 'a';
                return String.valueOf(palin);
            }
        }
        
        palin[length - 1] = 'b';
        return String.valueOf(palin);
    }
}