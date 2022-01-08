class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        return helperCount(g, s);
    }
    public int helperCount(int[] g, int[] s) {
        int gLength = g.length;
        int sLength = s.length;
        
        int g1 = 0;
        int s1 = 0;
        int count = 0;
        while (g1 < gLength && s1 < sLength) {
            if(g[g1] <= s[s1]) {
                count++;
                g1++;
                s1++;
            } else if (g[g1] > s[s1]) {
                s1++;
            }
        }
        return count;
    }
}