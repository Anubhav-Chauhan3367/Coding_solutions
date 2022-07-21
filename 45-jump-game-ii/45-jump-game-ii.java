class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;
        int jump = 1;
        int steps = nums[0];
        int max = nums[0];
        for(int i=1; i<=n-1; i++){
            
            if(i == n-1) return jump;
            
            max = Math.max(max, i+nums[i]);
            
            steps--;
            
            if(steps == 0){
                
                jump++;
                
                if(i>=max) return -1;
                
                steps = max-i;
                
            }
            
            
        }
        return jump;
    }
}