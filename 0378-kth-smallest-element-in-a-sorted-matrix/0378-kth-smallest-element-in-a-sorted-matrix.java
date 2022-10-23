class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];
        
        while(low < high) {
            int mid = low + (high - low) / 2;
            
            int count = smallerCount(matrix, mid);
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    private int smallerCount(int[][] matrix, int target) {
        int n = matrix.length;
        int i = n - 1;
        int j = 0;
        int count = 0;
        while (i >= 0 && j < n) {
            if (matrix[i][j] > target) {
                i--;
            } else {
                count = count + i + 1;
                j++;
            }
        }
        return count;
    }
}