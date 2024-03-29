class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        int res = 0;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String word: words) {
            map.put(word, 1);
            for(int i = 0; i < word.length(); i++) {
                StringBuilder sb = new StringBuilder(word);
                String next = sb.deleteCharAt(i).toString();
                if(map.containsKey(next)) {
                    map.put(word, Math.max(map.get(word), map.get(next) + 1));
                }
            }
            
            res = Math.max(res, map.get(word));
        }
        return res;
    }
}