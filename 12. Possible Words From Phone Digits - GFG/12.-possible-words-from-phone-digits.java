// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class PhoneDigit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//testcases
        
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); // input size of array
            int arr[] = new int[n]; //input the elements of array that are keys to be pressed
            
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();//input the elements of array that are keys to be pressed
            ArrayList <String> res = new Solution().possibleWords(arr, n);
            for (String i : res) System.out.print (i + " ");
             System.out.println();
              
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here 
        ArrayList<String> arr = new ArrayList<String>();
        
        util(a, N, arr, "");
        Collections.sort(arr);
        
        return arr;
     
    }
    
    
    
    static void util(int a[], int N, ArrayList<String> arr, String s){
        
        if(N == 0){
            arr.add(s);
            return;
        }
        
        String a1[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        util(a, N-1, arr, a1[a[N-1]].charAt(0)+s);
        util(a, N-1, arr, a1[a[N-1]].charAt(1)+s);
        util(a, N-1, arr, a1[a[N-1]].charAt(2)+s);
        if(a1[a[N-1]].length()==4){
            util(a, N-1, arr, a1[a[N-1]].charAt(3)+s);
        }
    }
}


