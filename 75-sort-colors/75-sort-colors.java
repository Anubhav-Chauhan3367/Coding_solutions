class Solution {
    public void sortColors(int[] nums) {
        
        int zeros=0, ones=0, twos=0; 
        
        for(int a: nums){
            if(a == 0){
                zeros++;
            }
            else if(a == 1){
                ones++;
            }
            else{
                twos++;
            }
        }
        
        for(int i=0; i<zeros; i++){
            nums[i] = 0;
        }
        for(int i=0; i<ones; i++){
            nums[i+zeros] = 1;
        }
        for(int i=0; i<twos; i++){
            nums[i+ones+zeros] = 2;
        }
        
    }
}