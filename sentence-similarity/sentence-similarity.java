class Solution {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if (sentence1.length != sentence2.length){
            return false;
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for(List<String> pair: similarPairs) {
            String s1 = pair.get(0);
            String s2 = pair.get(1);
            if(map.containsKey(s1) == false) {
                map.put(s1, new ArrayList<String>());
            }
            if(map.containsKey(s2) == false) {
                map.put(s2, new ArrayList<String>());
            }
            
            map.get(s1).add(s2);
            map.get(s2).add(s1);
        }
        for(int i = 0; i < sentence1.length; i++) {
            if(sentence1[i].equals(sentence2[i])) {
                continue;
            }
            if(map.containsKey(sentence1[i])) {
                if(map.get(sentence1[i]).contains(sentence2[i]) == false) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}