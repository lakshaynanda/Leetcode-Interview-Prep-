class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2*n];
        int left = 0;
        int right = n;
        for(int i = 0; i < ans.length; i++) {
            if(i % 2 == 0) {
                ans[i] = nums[left];
                left++;
            } else {
                ans[i] = nums[right];
                right++;
            }
        }
        return ans;
    }
}