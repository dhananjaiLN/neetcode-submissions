class Solution {
    public int maxProfit(int[] prices) {
        int profit=Integer.MIN_VALUE;
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            profit=Math.max(profit,prices[i]-min);
        }
        return profit;
    }
}
