class Solution {
    private int[] cumulative;
    private int sum;
    public Solution(int[] w) {
        cumulative = new int[w.length];
        for(int i = 0; i < w.length; i++) {
            sum += w[i];
            cumulative[i] = sum;
        }
    }
    
    public int pickIndex() {
        int index = (int)(Math.random()*sum);
        return binarySearch(index + 1);
    }
    public int binarySearch(int index) {
        int left = 0;
        int right = cumulative.length - 1;
        while (left < right) {
            int mid = left + (right - left)/2;
            if (cumulative[mid] < index) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */