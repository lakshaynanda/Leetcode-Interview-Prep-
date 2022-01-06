class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int sum = 0;
        int it1 = 1;
        int it2 = 0;
        for(int i = 2; i <= n; i++) {
            sum = it1 + it2;
            it2 = it1;
            it1 = sum;
        }
        return sum;
    }
}