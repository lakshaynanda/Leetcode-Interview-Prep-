class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for(int j = 0 ; j < n; j++) {
                if(n % 2 != 0) {
                    if(i == j) {
                        sum += mat[i][j];
                    }
                    if ((i + j == n - 1) && (i != Math.ceil(n / 2) && (j != Math.ceil(n / 2)))) {
                        sum += mat[i][j];
                    }
                } else {
                    if(i == j) {
                        sum += mat[i][j];
                    }
                    if ((i + j == n - 1)) {
                        sum += mat[i][j];
                    }
                }
                
            }
        }
        return sum;
    }
}