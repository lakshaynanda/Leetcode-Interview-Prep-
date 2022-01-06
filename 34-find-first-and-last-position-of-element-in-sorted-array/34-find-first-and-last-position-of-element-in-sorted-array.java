class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        res[0] = firstIndex(nums, target);
        res[1] = lastIndex(nums, target);
        return res;
    }
    public int firstIndex(int[] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            if(nums[mid] == target) {
                index = mid;
            }
        } 
        return index;
    }
    public int lastIndex(int[] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if(nums[mid] == target) {
                index = mid;
            }   
        }
        return index;
    }
}