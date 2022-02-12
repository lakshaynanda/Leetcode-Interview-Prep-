class Solution {
    public int longestStrChain(String[] words) {
        HashMap<String, Integer> dp = new HashMap<>();
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        int longestWord = 1;
        
        for(String word: words) {
            int presentlength = 1;
            for(int i = 0; i < word.length(); i++) {
                StringBuilder sb = new StringBuilder(word);
                sb.deleteCharAt(i);
                String pred = sb.toString();
                int prevLength = dp.getOrDefault(pred, 0);
                presentlength = Math.max(presentlength, prevLength + 1);
            }
            dp.put(word, presentlength);
            longestWord = Math.max(longestWord, presentlength);
        }
        return longestWord;
    }
}