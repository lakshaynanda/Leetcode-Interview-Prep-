class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int pos1 = -1;
        int pos2 = -1;
        int minDis = Integer.MAX_VALUE;
        for(int i = 0; i < wordsDict.length; i++) {
            if(wordsDict[i].equals(word1)) {
                pos1 = i;
            }
            if(wordsDict[i].equals(word2)) {
                pos2 = i;
            }
            
            if(pos1 != -1 && pos2 != -1) {
                minDis = Math.min(minDis, Math.abs(pos1-pos2));
            }
        }
        return minDis;
    }
}