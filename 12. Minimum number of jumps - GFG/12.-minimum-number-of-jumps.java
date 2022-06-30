// { Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    //reading input using BufferedReader
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	    
	    //reading total testcases
        int t = Integer.parseInt(br.readLine()); 

        int numOfTestCases = t;

        for(int p = 0;p<numOfTestCases;p++){
            //reading size of array 
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            
            //adding elements to the Array
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            
            //creating an object of class DynamicProgramming
            Solution obj = new Solution();
            
            //calling method minimumJumps() of class
            //DynamicProgramming
            System.out.println(obj.minimumJumps(arr, size));
        }
	 }
	
}
// } Driver Code Ends





class Solution
{
    //Function to find minimum number of jumps to reach the end of the array.
    public static int minimumJumps(int arr[], int n)
    {
        // your code here
        if(n <= 1) return 0;
        if(arr[0] == 0) return -1;
        
        int jumps = 1;
        int mr = arr[0];
        int steps = arr[0];
        
        for(int i=1; i<n; i++){
            
            if(i == n-1){
                return jumps;
            }
            
            mr = Math.max(mr, i+arr[i]);
            steps--;
            
            if(steps == 0){
                
                jumps++;
                
                if(i >= mr){
                    return -1;
                }
                
                steps = mr-i;
                
            }
            
            
        }
        return -1;
    }
}
