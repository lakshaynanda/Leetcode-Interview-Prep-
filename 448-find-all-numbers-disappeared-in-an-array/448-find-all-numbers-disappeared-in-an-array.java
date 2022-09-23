class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], true);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                list.add(i);
            }
        }
        return list;
    }
}