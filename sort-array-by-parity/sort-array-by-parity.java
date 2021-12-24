class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                res.add(nums[i]);
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 != 0) {
                res.add(nums[i]);
            }
        }
        int[] arr = new int[res.size()];
        for(int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }
}