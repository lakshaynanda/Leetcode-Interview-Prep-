class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        
        long num = 0;
        
        int left = 2;
        int right = x / 2;
        
        while (left <= right) {
            int mid = left + (right - left)/2;
            num = (long) mid*mid;
            if (num < x) {
                left = mid + 1;
            } else if (num > x) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return right;
    }
}