class Solution {
    public int poorPigs(int b, int minutesToDie, int minutesToTest) {
        int d = minutesToTest/minutesToDie;
        int ans = (int)(Math.log(b-1)/Math.log(d+1));
        if(b == 1) return 0;
        return ans+1;
    }
}