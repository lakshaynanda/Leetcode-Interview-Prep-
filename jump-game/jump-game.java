class Solution {
    public boolean canJump(int[] nums) {
        int lastGood = nums.length - 1;
        
        for(int i = nums.length - 2; i >= 0; i--) {
            if(i + nums[i] >= lastGood) {
                lastGood = i;
            }
        }
        return lastGood == 0 ? true: false;
    }
}