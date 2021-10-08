class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int ans = -1;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                ans = nums[i];
            } else {
                continue;
            }
        }
        return ans;
    }
}