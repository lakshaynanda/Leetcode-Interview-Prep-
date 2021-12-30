class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int ans[] = new int[2];
        int sum1 = 0;
        int sum2 = 0;
        
        for(int num: aliceSizes) {
            sum1 += num;
        }
        for(int num: bobSizes) {
            sum2 += num;
        }
        int average = (sum2 - sum1)/2;
        Set<Integer> setB = new HashSet<>();
        for(int num : bobSizes) {
            setB.add(num);
        }
        for(int num: aliceSizes) {
            if(setB.contains(num + average)) {
                ans[0] = num;
                ans[1] = num + average;
            }
        }
        return ans;
    }
}