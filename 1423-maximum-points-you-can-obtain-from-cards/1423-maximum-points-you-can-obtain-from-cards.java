class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        for(int i=1; i<=k; i++){
            sum += cardPoints[n-i];
        }
        
        int ans = sum;
        for(int i=0; i<k; i++){
            sum += cardPoints[i];
            sum -= cardPoints[n-k+i];
            ans = Math.max(sum, ans);
        }
        
        return ans;
    }
}