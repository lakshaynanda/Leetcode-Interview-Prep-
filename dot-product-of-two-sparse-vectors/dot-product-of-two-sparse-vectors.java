class SparseVector {
    HashMap<Integer, Integer> mapping;
    SparseVector(int[] nums) {
        mapping = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                mapping.put(i, nums[i]);
            }
        }
    }
    
	// Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int result = 0;
        for(Integer i : this.mapping.keySet()) {
            if(vec.mapping.containsKey(i)) {
                result += vec.mapping.get(i) * this.mapping.get(i);
            }
        }
        return result;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);