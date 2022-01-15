class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int s1 = str1.length();
        int s2 = str2.length();
        
        if (s2 > s1) {
            return gcdOfStrings(str2, str1);
        }
        
        if (s1 == s2) {
            if (str1.equals(str2)) {
                return str1;
            } else {
                return "";
            }
        }
        if (str1.startsWith(str2)) {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
        return "";
    }
}