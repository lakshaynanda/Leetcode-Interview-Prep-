class Solution {
    public int myAtoi(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int start = 0; 
        int end = s.length();
        boolean isNegative = false;
        
        for(int i = 0; i < end; i++) {
            if(s.charAt(i) != ' ') {
                start = i;
                break;
            }
        }
        
        if(s.charAt(start) == '+' || s.charAt(start) == '-') {
            isNegative = s.charAt(start) == '-' ? true: false;
            start += 1;
        }
        
        for(int i = start; i < end; i++) {
            if(s.charAt(i) < 48 || s.charAt(i) > 57) {
                end = i;
                break;
            }
        }
        return parsedIntToString(start, end, s, isNegative);
    }
    public static int parsedIntToString(int start, int end, String s, boolean isNegative) {
        if(start == end) {
            return 0;
        }
        if(Double.parseDouble(s.substring(start, end)) < Integer.MIN_VALUE || Double.parseDouble(s.substring(start, end)) > Integer.MAX_VALUE) {
            return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        } else {
            return isNegative ? (-1 * Integer.parseInt(s.substring(start, end))) : Integer.parseInt(s.substring(start, end));
        }
    }
}