class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int n = nums.length;
        int high = n - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[low] <= nums[high]) {
                return nums[low];
            }
            if ((mid == low || nums[mid - 1] > nums[mid]) && (mid == high || nums[mid] < nums[mid + 1])) {
                return nums[mid];
            }
            if (nums[low] <= nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 456789;
    }
}