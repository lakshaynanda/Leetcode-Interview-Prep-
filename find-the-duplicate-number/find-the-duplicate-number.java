class Solution {
    public int findDuplicate(int[] nums) {
        int tor = nums[0];
        int rab = nums[0];
        do {
            tor = nums[tor];
            rab = nums[nums[rab]];
        } while(tor != rab);
        
        tor = nums[0];
        
        while(tor != rab) {
            tor = nums[tor];
            rab = nums[rab];
        }
        
        return rab;
    }
}