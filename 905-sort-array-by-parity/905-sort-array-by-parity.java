class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int index = 0;
        int []num = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                num[index++] = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                num[index++] = nums[i];
            }
        }
        return num;
    }
}