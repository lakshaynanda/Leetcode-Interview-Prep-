class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int ans = 0;
        while(left < right) {
            if(height[left] < height[right]) {
                if(height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    ans += (leftMax - height[left]) * 1;
                }
                left++;
            } else {
                if(height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    ans += (rightMax - height[right]) * 1;
                }
                right--;
            }
        }
        return ans;
    }
}