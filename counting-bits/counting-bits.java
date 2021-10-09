class Solution {
    public int[] countBits(int n) {
        int res[] = new int[n + 1];
        
        for(int i = 0; i <= n; i++) {
            res[i] = findBin(i);
        }
        return res;
    }
    public int findBin(int n) {
        int count = 0;
        int ans[] = new int[35];
        int i = 0;
        while (n > 0) {
            ans[i] = n % 2;
            n = n / 2;
            i++;
        }
        
        for(int j = 0; j < ans.length; j++) {
            if (ans[j] == 1) {
                count++;
            }
        }
        return count;
    }
}