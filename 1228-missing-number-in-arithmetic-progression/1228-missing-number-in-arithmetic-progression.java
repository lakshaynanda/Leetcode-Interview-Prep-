class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        
        int diff = (arr[n - 1] - arr[0]) / n;
        int lo = 0;
        int hi = n - 1;
        
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            
            if (arr[mid] == arr[0] + mid * diff) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return arr[0] + diff * lo;
    }
}