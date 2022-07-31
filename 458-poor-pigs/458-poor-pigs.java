class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        
        int i = 0;
        int t = minutesToTest/minutesToDie;
        
        while(Math.pow(t+1, i) < buckets){
            i++;
        }
        return i;
    }
}