class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] ans = new int[2];
        hm.put(nums[0], 0);
        
        for(int i=1; i<nums.length; i++){
            if(hm.containsKey(target-nums[i])){
                ans[0] = hm.get(target-nums[i]);
                ans[1] = i;
            } 
            else{
                hm.put(nums[i], i);
            }
        }
        
        return ans;
    }
}