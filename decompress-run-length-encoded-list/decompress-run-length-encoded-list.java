class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i+=2) {
            int count = nums[i];
            while(count != 0) {
                arr.add(nums[i + 1]);
                count--;
            }
        }
        int res[] = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }
        return res;
    }
}