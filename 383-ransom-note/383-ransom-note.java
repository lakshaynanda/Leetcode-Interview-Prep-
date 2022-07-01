class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int map[] = new int[26];
        
        for(char c : magazine.toCharArray()) {
            map[c - 'a']++;
        }
        for(char c : ransomNote.toCharArray()) {
            int val = map[c - 'a'];
            if (val <= 0) {
                return false;
            }
            map[c - 'a']--;
        }    
        return true;
    }
}