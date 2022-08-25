class Solution {
    public int maxProfit(int[] prices) {
        
        int ans = 0; 
        int min = prices[0];
        for(int price: prices){
            min = Math.min(min, price);
            ans = Math.max(ans, price-min);
        }
        
        return ans;
    }
}