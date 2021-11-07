class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        
        if(n == 1) {
            return;
        }
        
        int lastIndex = -1;
        int i = 1; //check last peak
        while(i < n) {
            if(nums[i] > nums[i - 1]) {
                lastIndex = i;
            }
            i++;
        }
        // if descending order then as swap half elements to sort in ascending order
        if(lastIndex == -1) {
            for(int j = 0; j < n/2; j++) {
                int temp = nums[j];
                nums[j] = nums[n - j - 1];
                nums[n - j - 1] = temp;
            }
            return;
        }
        int mn = nums[lastIndex];
        int index = lastIndex;
        for(int k = lastIndex; k < n; k++) {
            if(nums[k] > nums[lastIndex - 1] && nums[k] < nums[index]) {
                index = k;
            }
        }
        int temp = nums[lastIndex - 1];
        nums[lastIndex - 1] = nums[index];
        nums[index] = temp;
         
        Arrays.sort(nums, lastIndex, n);
        
    }
}