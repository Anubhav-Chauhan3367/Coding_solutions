// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class OptimalStrategy
{
    public static void main (String[] args) {
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking number of elements
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            //inserting the elements
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
                
           //calling the countMaximum() method of class solve
           System.out.println(new solve().countMaximum(arr, n)); 
        }
    }
    
    
}// } Driver Code Ends



class solve
{
    //Function to find the maximum possible amount of money we can win.
    static long countMaximum(int arr[], int n)
    {
        // Your code here
        int dp[][] = new int[n][n];
        
        for(int i=0; i<n-1; i++) dp[i][i+1] = Math.max(arr[i], arr[i+1]);
        
        for(int gap=3; gap<n; gap+=2){
            for(int i=0; i+gap<n; i++){
                int j = i+gap;
                
                dp[i][j] = Math.max(arr[i]+Math.min(dp[i+1][j-1], dp[i+2][j]),
                                    arr[j]+Math.min(dp[i+1][j-1], dp[i][j-2]));
                
            }
        }
        return dp[0][n-1];
    }
}

