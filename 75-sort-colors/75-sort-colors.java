class Solution {
    public void sortColors(int[] nums) {
        int p1 = 0;
        int curr = 0;
        int p2 = nums.length - 1;
        int temp;
        while(curr <= p2) {
            if(nums[curr] == 0) {
                temp = nums[p1];
                nums[p1++] = nums[curr];
                nums[curr++] = temp;
            } else if (nums[curr] == 2) {
                temp = nums[p2];
                nums[p2--] = nums[curr];
                nums[curr] = temp;
            } else {
                curr++;
            }
        }
    }
}