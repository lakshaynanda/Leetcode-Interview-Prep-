class Solution {
    public int[] searchRange(int[] nums, int target) {
       ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                arr.add(i);
            }
        }
        int res[] = new int[2];
        if (arr.size() > 0) {
            res[0] = arr.get(0);
            res[1] = arr.get(arr.size() - 1);
        } else {
            res[0] = -1;
            res[1] = -1;
        }
        
        return res;
    }
}