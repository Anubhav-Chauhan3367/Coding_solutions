class Solution {
    public int minPathSum(int[][] grid) {
        
        int ans = 0;
        int n = grid.length;
        int m = grid[0].length;
        int dp[][] = new int[n][m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i==0 && j==0) dp[i][j] = grid[i][j];
                else{
                    
                    int up = i>0?dp[i-1][j]:Integer.MAX_VALUE;
                    
                    int left = j>0?dp[i][j-1]:Integer.MAX_VALUE;
                    
                    dp[i][j] = grid[i][j]+ Math.min(up, left); 
                    
                }
            }
        }
        
        
        return dp[n-1][m-1];
    }
}