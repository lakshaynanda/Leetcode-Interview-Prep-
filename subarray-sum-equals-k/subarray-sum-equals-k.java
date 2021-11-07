class Solution {
    public int subarraySum(int[] nums, int k) {
        int cumu[] = new int[nums.length + 1];
        cumu[0] = 0;
        for(int i = 1; i <= nums.length; i++) {
            cumu[i] = cumu[i - 1] + nums[i - 1];
        }
        int count = 0;
        for(int start = 0; start < nums.length; start++) {
            for(int end = start + 1; end <= nums.length; end++) {
                if (cumu[end] - cumu[start] == k) {
                    count++;
                }
            }
        }
        return count;
    }
}