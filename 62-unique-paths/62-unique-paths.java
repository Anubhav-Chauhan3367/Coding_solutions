class Solution {
    public int uniquePaths(int m, int n) {
        
        int N = m+n-2;
        int r = n-1;
        double ans = 1;
        for(int i=r+1; i<=N; i++){
            ans *= i;
            ans /= i-r;
        }
        return (int)ans;
    }
}