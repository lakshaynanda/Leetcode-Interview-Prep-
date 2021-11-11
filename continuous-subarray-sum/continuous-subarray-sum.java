class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int remainder = 0;
        HashMap<Integer, Integer> remainders = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            remainder = (remainder + nums[i]) % k;
            if (remainder > 0) {
                if (remainders.containsKey(remainder)) {
                    if (i - remainders.get(remainder) > 1) {
                        return true;
                    }
                } else {
                    remainders.put(remainder, i);
                }
            } else if (i > 0) {
                //remainder == 0
                return true;
            }
        }
        return false;
    }
}