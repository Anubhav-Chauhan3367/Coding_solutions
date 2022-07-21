class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        // int[] out = new int[gas.length];
        // int sum = 0;
        // for(int i=0; i<gas.length; i++){
        //     out[i] = gas[i]-cost[i];
        //     sum = sum+out[i];
        // }
        // if(sum<0) return -1;
        int sum = 0;
        int s = 0;
        int tot = 0;
        for(int i=0; i<gas.length; i++){
            
            sum += gas[i]-cost[i];
            tot += gas[i]-cost[i];
            
            if(sum < 0){
                s = i+1;
                sum = 0;
            }
            
        }
        
        return tot<0?-1:s;
    }
}