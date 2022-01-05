class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        
        for(int i = 0; i < nums.length && diff != 0; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            int sum = 0;
            while(low < high) {
                sum = nums[low] + nums[high] + nums[i];
                
                if(Math.abs(target - sum) < Math.abs(diff)) {
                    diff = target - sum;
                }
                
                if (sum < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return target - diff;
    }
}