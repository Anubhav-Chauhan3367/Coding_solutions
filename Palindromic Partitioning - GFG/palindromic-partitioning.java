// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int palindromicPartition(String str)
    {
        // code here
        int n = str.length();
        int dp[][] = new int[str.length()][str.length()];
        
        for(int i=0; i<n; i++){
            dp[i][i] = 0;
        }
        
        for(int gap=1; gap<n; gap++){
            for(int i=0; i+gap<n; i++){
                int j=i+gap;
                if(isPalindrome(str, i, j)) dp[i][j] = 0;
                else{
                    dp[i][j] = Integer.MAX_VALUE;
                    for(int k=i; k<j; k++){
                        dp[i][j] = Math.min(dp[i][j], dp[i][k]+dp[k+1][j]+1);
                    }
                }
            }
        }
        
        return dp[0][n-1];
    }
    
    static boolean isPalindrome(String str, int i, int j){
        
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
}