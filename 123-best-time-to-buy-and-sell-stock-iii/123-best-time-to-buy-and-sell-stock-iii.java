class Solution {
    public int maxProfit(int[] prices) {
        
        int profit1 = 0;
        int profit2 = 0;
        int invest1 = Integer.MAX_VALUE;
        int invest2 = Integer.MIN_VALUE;
        
        
        
        for(int i=0; i<prices.length; i++){
            invest1 = Math.min(prices[i], invest1);
            profit1 = Math.max(profit1, prices[i]-invest1);
            
            
            invest2 = Math.max(invest2, profit1-prices[i]);
            profit2 = Math.max(profit2, prices[i]+invest2);
                
        }
            
        return profit2;
    }
}
