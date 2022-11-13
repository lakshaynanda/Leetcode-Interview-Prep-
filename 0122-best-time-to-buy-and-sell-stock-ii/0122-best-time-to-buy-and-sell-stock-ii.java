class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minSoFar = prices[0];
        int maxSoFar = prices[0];
        for(int i = 0; i < prices.length - 1; i++) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            minSoFar = prices[i];
            maxProfit -= minSoFar;
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }
            maxSoFar = prices[i]; 
            maxProfit += maxSoFar;
        }
        
        return maxProfit;
    }
}