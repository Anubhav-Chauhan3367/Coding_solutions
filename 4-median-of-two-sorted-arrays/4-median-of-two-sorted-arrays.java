class Solution {
    public double findMedianSortedArrays(int[] A, int[] B) {
        
        if(A.length > B.length) return findMedianSortedArrays(B, A);
        int n = A.length;
        int m = B.length;
        
        int l=0, r=n;
        while(l <= r){
            
            int i = (l+r) >> 1;
            int j = (n+m+1)/2-i;
            
            int aL = (i==0)?Integer.MIN_VALUE:A[i-1];
            int bL = (j==0)?Integer.MIN_VALUE:B[j-1];
            int aR = (i==n)?Integer.MAX_VALUE:A[i];
            int bR = (j==m)?Integer.MAX_VALUE:B[j];
          
            if(aL <= bR  && bL <= aR){
                
                if((n+m)%2==0){
                    return (Math.max(aL, bL)+Math.min(aR, bR))/(double)2;
                }
                else{
                    return (double)Math.max(aL, bL);
                }
                
            }
            
            else if(aL > bR){
                r = i-1;
            }
            else if(bL > aR){
                l = i+1;
            }
            

        }
        
        return 0.0;
    }
}