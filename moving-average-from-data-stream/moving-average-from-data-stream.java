class MovingAverage {
    int capacity;
    int presum = 0;
    Queue<Integer> queue;
    public MovingAverage(int size) {
        queue = new LinkedList<>();
        capacity = size;
        presum = 0;
    }
    
    public double next(int val) {
        queue.add(val);
        presum += val;
        
        if(queue.size() > capacity) {
            int rem = queue.poll();
            presum -= rem;
        }
        return (double)presum/queue.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */