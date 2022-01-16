class Solution {
    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int stick: sticks) {
            minHeap.add(stick);
        }
        int res = 0;
        while (minHeap.size() > 1) {
            int p1 = minHeap.poll();
            int p2 = minHeap.poll();
            res += p1 + p2;
            minHeap.add(p1 + p2);
        }
        return res;
    }
}