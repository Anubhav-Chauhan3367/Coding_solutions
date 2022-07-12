// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //testcases        
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //input string
            String st = sc.next();
            
            //calling powerSet() function
            ArrayList<String> ans = new LexSort().powerSet(st);
            
            //sorting the result of the powerSet() function
            Collections.sort(ans);
    
            //printing the result
            for(String s: ans)
                System.out.print(s + " ");
            System.out.println();    
        }
    }
}


 // } Driver Code Ends
//User function Template for Java


class LexSort
{
    //Function to return the lexicographically sorted power-set of the string.
    static ArrayList<String> powerSet(String s)
    {
        // add your code here
        ArrayList<String> arr = new ArrayList<String>();
        
        powerSetUtil(s, arr, "");
        Collections.sort(arr);
        return arr;
        
    }
    
    static void powerSetUtil(String s, ArrayList<String> arr, String a){
        
        if(s.length()==0){
            arr.add(a); 
            return;
        } 
        
        powerSetUtil(s.substring(0, s.length()-1), arr, a);
        powerSetUtil(s.substring(0, s.length()-1), arr, s.charAt(s.length()-1)+a);
    }
}


 

// { Driver Code Starts.

                                // } Driver Code Ends