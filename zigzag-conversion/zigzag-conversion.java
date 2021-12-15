class Solution {
    public String convert(String s, int numRows) {
        HashMap<Integer, StringBuilder> map = new HashMap<>();
        boolean incr = true;
        int pos = 0;
        for(char c : s.toCharArray()) {
            if(pos == numRows) {
                incr = false;
            }
            if(pos == 1) {
                incr = true;
            }
            
            if(incr) {
                pos++;
            } else {
                pos--;
            }
            if(!map.containsKey(pos)) {
                map.put(pos, new StringBuilder());
            }
            map.get(pos).append(c);
        }
        StringBuilder str = new StringBuilder();
        for(int i : map.keySet()) {
            str.append(map.get(i));
        }
        return str.toString();
    }
}