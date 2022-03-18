class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i = 0; i < nums.length; i++) {
            minHeap.add(nums[i]);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        // for(int i = k; i < nums.length; i++) {
        //     if(minHeap.peek() < nums[i]) {
        //         minHeap.poll();
        //         minHeap.add(nums[i]);
        //     }
        // }
        
        return minHeap.poll();
        
    }
}