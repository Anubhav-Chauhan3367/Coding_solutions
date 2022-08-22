class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        ans = new ArrayList<>();
        
        combo(candidates, target, 0, new ArrayList<Integer>());
        
        return ans;
        
    }
    
    public void combo(int[] candidates,int target, int index, List<Integer> combination){
       
         
        if(index >= candidates.length || target < 0) return;
       
        if(target == 0){
            ans.add(new ArrayList<>(combination));
            return;
        }
        
        combination.add(candidates[index]);
        combo(candidates, target-candidates[index], index, combination);
        combination.remove(combination.size()-1);
        combo(candidates, target, index+1, combination);
    }
}