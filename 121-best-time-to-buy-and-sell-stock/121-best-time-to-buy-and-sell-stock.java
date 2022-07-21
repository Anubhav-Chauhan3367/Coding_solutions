class Solution {
    public int maxProfit(int[] prices) {
        
        int profit=0;
        
        int n=prices.length;
        int l=0;
        int r=0;
        for(int i=1; i<n; i++){
            if(prices[i] < prices[l]){
                l = i;
                r = i;
            }
            else if(prices[i] > prices[r]){
                r = i;
                profit = Math.max(profit, prices[r]-prices[l]);
            }
        }
        return profit;
    }
}