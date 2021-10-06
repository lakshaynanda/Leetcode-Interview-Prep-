class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedAnagrams = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs) {
            char []characters = s.toCharArray();
            Arrays.sort(characters);
            String str = new String(characters);
            
            if(!map.containsKey(str)) {
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(s);
        }
        groupedAnagrams.addAll(map.values());
        return groupedAnagrams;
    }
}