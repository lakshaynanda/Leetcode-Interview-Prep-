class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                heap.add(matrix[i][j]);
            }
        }
        
        while (k > 1) {
            heap.poll();
            k--;
        }
        
        return heap.poll();
    }
}