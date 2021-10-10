class Solution {
    private int[] nums;
    private Random random;
    public Solution(int[] nums) {
        this.nums = nums;
        random = new Random();
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() {
        int copy[] = nums.clone();
        for(int i = nums.length - 1; i >= 0; i--) {
            int ranVal = random.nextInt(i + 1);
            int temp = copy[i];
            copy[i] = copy[ranVal];
            copy[ranVal] = temp;
        }
        return copy;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */