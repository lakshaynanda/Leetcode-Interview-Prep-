class Solution {
    public void sortColors(int[] nums) {
        bubbleSort(nums);
    }
    public void bubbleSort(int[] nums) {
        boolean boolSwap = false;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 1; j < nums.length; j++) {
                if(nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    boolSwap = true;
                }
            }
            
            if(boolSwap == false) {
                break;
            }
        }
    }
}