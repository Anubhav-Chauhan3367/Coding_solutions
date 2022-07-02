// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG { 
    
	public static void main (String[] args) throws IOException  {
	    
	    //reading input using BufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//reading total testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    
		    //reading number of eggs and floors
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    int n = Integer.parseInt(inputLine[0]);
		    int k = Integer.parseInt(inputLine[1]);
		    
		    //calling eggDrop() method of class
		    //EggDrop
		    System.out.println(new Solution().eggDrop(n, k));
		}
	}
}


// } Driver Code Ends


class Solution 
{
    //Function to find minimum number of attempts needed in 
    //order to find the critical floor.
    static int eggDrop(int n, int k) 
	{
	    // Your code here
	    int dp[][] = new int[k+1][n+1];
	    
	    for(int i=1; i<=n; i++){
	        dp[0][i] = 0;
	        dp[1][i] = 1;
	    }
	    for(int i=0; i<=k; i++){
	        dp[i][1] = i;
	    }
	    
	    for(int i=2; i<=k; i++){
	        for(int j=2; j<=n; j++){
	            int value = Integer.MAX_VALUE;
	            for(int z=1; z<=i; z++){
	                value = Math.min(value, 1+Math.max(dp[z-1][j-1], dp[i-z][j]));
	            }
	            dp[i][j] = value;
	        }
	    }
	    
	    return dp[k][n];
	}
}