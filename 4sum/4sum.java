class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length - 3; i++) {
            if(i == 0 || (i > 0 && (nums[i] != nums[i - 1]))) {
                for(int j = i + 1; j < nums.length - 2; j++) {
                    if(j == i + 1 || (j > i + 1 && nums[j] != nums[j - 1])) {
                        int low = j + 1;
                        int high = nums.length - 1;
                        while(low < high) {
                            int sum = nums[i] + nums[j] + nums[low] + nums[high];
                            if(sum == target) {
                                res.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                            
                                while(low < high && nums[low] == nums[low + 1]) {
                                    low++;
                                }
                                while(low < high && nums[high] == nums[high - 1]) {
                                    high--;
                                }
                            }
                            if (sum < target) {
                                low++;
                            } else {
                                high--;
                            }
                        } 
                    }
                }
            }
        }
        return res;
    }
}