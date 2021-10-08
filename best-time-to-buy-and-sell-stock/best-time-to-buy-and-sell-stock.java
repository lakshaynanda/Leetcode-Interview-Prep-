class Solution {
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxProf = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minValue) {
                minValue = prices[i];
            } else if (prices[i] - minValue > maxProf){
                maxProf = prices[i] - minValue;
            }
        }
        return maxProf;
    }
}