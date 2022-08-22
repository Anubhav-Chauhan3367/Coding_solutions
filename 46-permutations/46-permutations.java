class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        boolean [] taken = new boolean[nums.length];
        
        List<List<Integer>> ans = new ArrayList<>();
        
        permutations(nums, taken, new ArrayList<Integer>(), ans);
        
        return ans;
        
    }
    
    public void permutations(int[] nums, boolean[] taken, List<Integer> el, List<List<Integer>> ans){
     
        if(el.size() == nums.length){
            ans.add(new ArrayList<>(el));
        }
        
        
        for(int i=0; i<nums.length; i++){
            
            int curr = nums[i];
            if(!taken[i]){
                taken[i] = true;
                el.add(curr);
                permutations(nums, taken, el, ans);
                el.remove(Integer.valueOf(curr));
                taken[i] = false;
            }
            
        }
        
        
    }
}