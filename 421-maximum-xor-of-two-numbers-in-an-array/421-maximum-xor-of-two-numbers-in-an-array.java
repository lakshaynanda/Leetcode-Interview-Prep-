class Solution {
    public int findMaximumXOR(int[] nums) {
        int maxNum = nums[0];
        for(int num:nums) {
            maxNum = Math.max(maxNum, num);
        }
        int L = (Integer.toBinaryString(maxNum)).length();
        int maxXor = 0;
        int currXor;
        
        Set<Integer> prefixes = new HashSet<>();
        for(int i = L - 1; i > -1; i--) {
            maxXor <<= 1;
            currXor = maxXor | 1;
            prefixes.clear();
            
            for(int num : nums) {
                prefixes.add(num >> i);
            }
            for(int p : prefixes) {
                if(prefixes.contains(currXor ^ p)) {
                    maxXor = currXor;
                    break;
                }
            }
        }
        return maxXor;
    }
}