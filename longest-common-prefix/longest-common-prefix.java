class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null) {
            return "";
        }
        return helperdnc(strs, 0, strs.length - 1);
    }
    public static String helperdnc(String[] strs, int left, int right) {
        if(left == right) {
            return strs[left];
        } else {
            int mid = (left + right)/2;
            String lp = helperdnc(strs, left, mid);
            String rp = helperdnc(strs, mid + 1, right);
            return commonString(lp, rp);
        }
    }
    public static String commonString(String lp,  String rp) {
        int min = Math.min(lp.length(), rp.length());
        for(int i = 0; i < min; i++) {
            if(lp.charAt(i) != rp.charAt(i)) {
                return lp.substring(0, i);
            }
        }
        return lp.substring(0, min);
    }
}