class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int degree = 0;
        
        HashMap<Integer, Integer> seenFirst = new HashMap<>();
        int minLen = 0;
        
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            seenFirst.putIfAbsent(nums[i], i);
            if (degree < map.get(nums[i])) {
                degree = map.get(nums[i]);
                minLen = i - seenFirst.get(nums[i]) + 1;
            } else if (degree == map.get(nums[i])) {
                minLen = Math.min(minLen, i - seenFirst.get(nums[i]) + 1);
            }
        }
        return minLen;
    }
}