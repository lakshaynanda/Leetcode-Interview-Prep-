class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = -1;
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        for(int i = 0; i <= nums.length; i++) {
            if(!set.contains(i)) {
                ans = i;
            }
        }
        return ans;
    }
}