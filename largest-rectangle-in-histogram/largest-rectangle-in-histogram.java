class Solution {
    public int largestRectangleArea(int[] heights) {
        int left[] = new int[heights.length];
        int right[] = new int[heights.length];
        
        Stack<Integer> stack = new Stack();
        for(int i = 0; i < heights.length; i++) {
            if(stack.isEmpty()) {
                left[i] = 0;
                stack.push(i);
            } else {
                while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                    stack.pop();
                }
                left[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
                stack.push(i);
            }
        }
        stack = new Stack();
        for(int i = heights.length - 1; i >= 0; i--) {
            if(stack.isEmpty()) {
                right[i] = heights.length - 1;
                stack.push(i);
            } else {
                while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                    stack.pop();
                }
                right[i] = stack.isEmpty() ? heights.length - 1 : stack.peek() - 1;
                stack.push(i);
            }
        }
        int maxArea = 0;
        for(int i = 0; i < heights.length; i++) {
            maxArea = Math.max(maxArea, heights[i] * (right[i] - left[i] + 1));
        }
        return maxArea;
    }
}