class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int ns = s.length();
        int np = p.length();
        
        int[] pcount = new int[26];
        int[] scount = new int[26];
        
        for(char ch : p.toCharArray()) {
            pcount[ch - 'a']++;
        }
        List<Integer> output = new ArrayList<>();
        for(int i = 0; i < ns; i++) {
            scount[s.charAt(i) - 'a']++;
            
            if (i >= np) {
                scount[s.charAt(i - np) - 'a']--;
            }
            
            if (Arrays.equals(pcount, scount)) {
                output.add(i - np + 1);
            }
        }
        return output;
    }
}