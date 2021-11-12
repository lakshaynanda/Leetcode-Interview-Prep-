class Solution {
    public int pivotIndex(int[] nums) {
        int dp[] = new int[nums.length];
        dp[0] = 0;
        int ans = -1;
        for(int i = 0; i < dp.length; i++) {
            if(i == 0) {
                dp[i] = 0 - sumVal(i + 1, nums.length - 1, nums);
            } else {
                dp[i] = sumVal(0 ,i - 1, nums) - sumVal(i + 1, nums.length - 1, nums);
            }
        }
        for(int i = 0; i < dp.length; i++) {
            if (dp[i] == 0) {
                ans = i;
                break;
            }
        }
        return ans;
    }
    public int sumVal(int start, int end, int[] nums) {
        int suma = 0;
        for(int i = start; i <= end; i++) {
            suma += nums[i];
        }
        return suma;
    }
}