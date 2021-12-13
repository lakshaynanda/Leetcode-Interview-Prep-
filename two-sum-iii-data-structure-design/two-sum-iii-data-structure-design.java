class TwoSum {
    private ArrayList<Integer> nums;
    public TwoSum() {
        this.nums = new ArrayList<>();
    }
    
    public void add(int number) {
        this.nums.add(number);
    }
    
    public boolean find(int value) {
        Collections.sort(nums);
        int low = 0;
        int high = this.nums.size() - 1;
        
        while(low < high) {
            int twosum = this.nums.get(low) + this.nums.get(high);
            if(twosum < value) {
                low++;
            } else if (twosum > value){
                high--;
            } else {
                return true;
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