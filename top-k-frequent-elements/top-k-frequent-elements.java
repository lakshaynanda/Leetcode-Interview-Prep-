class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) {
            return nums;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((n1, n2) -> map.get(n1) - map.get(n2));
        
        for(int num: map.keySet()) {
            maxHeap.add(num);
            if(maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        int[] res = new int[k];
        for(int i = 0; i < res.length; i++) {
            res[i] = maxHeap.poll();
        }
        return res;
    }
}