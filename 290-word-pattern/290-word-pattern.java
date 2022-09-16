// TC: O(n)
// SC: O(1)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArr = s.split(" ");
        if (pattern.length() != strArr.length) {
            return false;
        }
        
        HashMap<Character, String> pMap = new HashMap();
        HashSet<String> set = new HashSet();
        
        for(int i = 0; i < pattern.length(); i++) {
            String str = strArr[i];
            char c = pattern.charAt(i);
            if (pMap.containsKey(c)) {
                if(!str.equals(pMap.get(c))) {
                    return false;
                }
            } else {
                if(set.contains(str)) {
                    return false;
                }
                pMap.put(c, str);
                set.add(str);
            }
        }
        return true;
    }
}