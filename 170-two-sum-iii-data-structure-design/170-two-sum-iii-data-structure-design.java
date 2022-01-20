class TwoSum {
    ArrayList<Integer> nums;
    public TwoSum() {
        nums = new ArrayList<>();
    }
    
    public void add(int number) {
        nums.add(number);
    }
    
    public boolean find(int value) {
        Collections.sort(nums);
        int left = 0;
        int right = nums.size() - 1;
        
        while (left < right) {
            if (value == nums.get(left) + nums.get(right)) {
                return true;
            } else if (value > nums.get(left) + nums.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */