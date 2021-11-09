class Solution {
    public double myPow(double x, long n) {
        long N = n;
        if(N < 0) {
            x = 1 / x;
            N = -N;
        }
        if (N == 0) {
            return 1.0;
        }
        double ans = 0;
        double half = myPow(x, N/2);
        if(N % 2 == 0) {
            ans = half*half;
        } else {
            ans = half*half*x;
        }
        return ans;
    }
}