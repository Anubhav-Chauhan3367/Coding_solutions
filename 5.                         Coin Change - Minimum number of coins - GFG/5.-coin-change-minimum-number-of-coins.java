// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total count of testcases
		int testcases=sc.nextInt();
		while(testcases-->0)
		{
		    //taking value
		    int value=sc.nextInt();
		    
		    //taking number of coins
		    int numberOfCoins=sc.nextInt();
		    int coins[]=new int[numberOfCoins];
		    
		    //adding coins to the array
		    for(int i=0;i<numberOfCoins;i++)
		    {
		        int x=sc.nextInt();
		        coins[i]=x;
		    }
		    
		    //creating an object of class Geeks
		    Solution obj=new Solution();
		    
		    //calling minimumNumberOfCoins() method of class Geeks
		    long answer=obj.minimumNumberOfCoins(coins,numberOfCoins,value);
		    
		    //printing "Not Possible" if answer is -1,
		    //else printing answer
		    System.out.println(answer==-1?"Not Possible":answer);
		}
	}
}


// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of coins to make the change 
    //for value using the coins of given denominations.
    public long minimumNumberOfCoins(int coins[],int n,int value)
    {
        // your code here
        int dp[] = new int[value+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        
        for(int i=1; i<=value; i++){
            for(int j=0; j<n; j++){
                int sub_res = 0;
                if(i >= coins[j]){
                    sub_res = dp[i-coins[j]];
                    if(sub_res != Integer.MAX_VALUE){
                        dp[i] = Math.min(dp[i], sub_res+1);
                    }
                }
            }
        }
        return (dp[value]==Integer.MAX_VALUE)?-1:dp[value];
    }
    
}