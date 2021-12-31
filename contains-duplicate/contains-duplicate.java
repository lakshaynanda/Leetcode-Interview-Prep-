class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums) {
            if(map.containsKey(num) && map.get(num) >= 1) {
                return true;
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return false;
    }
}