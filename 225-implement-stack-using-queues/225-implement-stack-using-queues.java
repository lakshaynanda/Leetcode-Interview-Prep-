class MyStack {
    Deque<Integer> queue;
    public MyStack() {
        queue = new ArrayDeque<>();
    }
    
    public void push(int x) {
        queue.addLast(x);
    }
    
    public int pop() {
        return queue.size() > 0 ? queue.removeLast() : 0;
    }
    
    public int top() {
        return queue.peekLast();
    }
    
    public boolean empty() {
        System.out.println(queue);
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */