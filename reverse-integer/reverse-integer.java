class Solution {
    public int reverse(int x) {
        int result = 0;
        
        while(x != 0) {
            int rem = x % 10;
            int newres = result * 10 + rem;
            if((newres - rem)/10 != result) {
                return 0;
            }
            result = newres;
            x = x / 10;
        }
        return result;
    }
}