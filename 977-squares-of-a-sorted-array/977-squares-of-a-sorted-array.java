class Solution {
    public int[] sortedSquares(int[] nums) {
        int result[] = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
            
        for(int i = nums.length - 1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                square = nums[right];
                right--;
            } else {
                square = nums[left];
                left++;
            }
            result[i] = square * square;
        }
        return result;
    }
}