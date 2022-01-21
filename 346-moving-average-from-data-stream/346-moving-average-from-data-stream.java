class MovingAverage {
    double presum = 0;
    Queue<Integer> queue;
    int len;
    public MovingAverage(int size) {
        queue = new LinkedList<>();
        presum = 0;
        len = size;
    }
    
    public double next(int val) {
        queue.add(val);
        presum += val;
        if (queue.size() > len) {
            int rem = queue.poll();
            presum -= rem;
        }
        return presum/queue.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */