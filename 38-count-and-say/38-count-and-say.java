class Solution {
    public String countAndSay(int n) {
        if(n == 1) {
            return String.valueOf(1);
        }
        return convert(countAndSay(n - 1));
    }
    public String convert(String n) {
        char prev = n.charAt(0);
        int freq = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < n.length(); i++) {
            if (prev != n.charAt(i)) {
                sb.append(freq);
                sb.append(prev);
                prev = n.charAt(i);
                freq = 0;
            }
            freq++;
        }
        sb.append(freq);
        sb.append(prev);
        return sb.toString();
    }
}