class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int[] out = new int[gas.length];
        int sum = 0;
        for(int i=0; i<gas.length; i++){
            out[i] = gas[i]-cost[i];
            sum = sum+out[i];
        }
        if(sum<0) return -1;
        sum = 0;
        int s = 0;
        for(int i=0; i<out.length; i++){
            
            sum += out[i];
            
            if(sum < 0){
                s = i+1;
                sum = 0;
            }
            
        }
        
        return s;
    }
}