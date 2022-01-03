class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int num = x;
        int rem = 0;
        if (x < 0) {
            return false;
        }
        
        while (num != 0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }
        if (reverse == x) {
            return true;
        } else {
            return false;
        }
    }
}