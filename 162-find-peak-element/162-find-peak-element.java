class Solution {
    public int findPeakElement(int[] nums) {
        return binarySearch(nums, 0, nums.length - 1);
    }
    public int binarySearch(int[] nums, int left, int right) {
        if(left == right) {
            return left;
        }
        int mid = left + (right-left)/2;
        
        
        if(nums[mid] > nums[mid + 1]) {
            return binarySearch(nums, left, mid);
        }
        return binarySearch(nums, mid + 1, right);
    }
}