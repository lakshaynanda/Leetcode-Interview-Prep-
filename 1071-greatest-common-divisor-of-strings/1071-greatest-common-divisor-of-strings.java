class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int s1 = str1.length();
        int s2 = str2.length();
        if (s1 < s2) {
            return gcdOfStrings(str2, str1);
        }
        if (s1 == s2) {
            if(str1.equals(str2)) {
                return str1;
            } else {
                return "";
            }
        }
        return str1.startsWith(str2) ? gcdOfStrings(str1.substring(s2), str2) : "";
    }
}