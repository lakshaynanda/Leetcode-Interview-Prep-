class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
        
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> (a[1] - b[1]));
        
        for(int[] interval : intervals) {
            if (!heap.isEmpty() && heap.peek()[1] <= interval[0]) {
                heap.poll();
            }
            heap.add(interval);
        }
        return heap.size();
    }
}