class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return String.valueOf(1);
        }
        return convert(countAndSay(n - 1));
    }
    public String convert(String s) {
        char prev = s.charAt(0);
        int freq = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < s.length(); i++) {
            if (prev != s.charAt(i)) {
                sb.append(freq);
                sb.append(prev);
                freq = 0;
                prev = s.charAt(i);
            }
            freq++;
        }
        sb.append(freq);
        sb.append(prev);
        return sb.toString();
    }
}