class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int remainder[] = new int[60];
        int count = 0;
        
        for(int t: time) {
            if(t % 60 == 0) {
                count += remainder[0];
            } else {
                count += remainder[60 - t % 60];
            }
            remainder[t % 60]++;
        }
        return count;
    }
}