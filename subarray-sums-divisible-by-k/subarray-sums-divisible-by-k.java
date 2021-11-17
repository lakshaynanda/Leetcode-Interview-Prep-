class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int ans = 0;
        int remSum = 0;
        for(int i= 0; i < nums.length; i++) {
            remSum += nums[i];
            int temp = remSum % k;
            if(temp < 0) {
                temp += k;
            }
            if(map.containsKey(temp)) {
                ans += map.get(temp);
            }
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        return ans;
    }
}