class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        
        int lo = 0;
        int high = n - 1;
        
        int diff = (arr[n - 1] - arr[0]) / n;
        
        while (lo <= high) {
            int mid = (lo + high) / 2;
            if (arr[mid] == arr[0] + mid * diff) {
                lo = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return arr[0] + diff * lo;
    }
}