/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        helper(root, targetSum, ans, new ArrayList<>());
        
        return ans;
    }
    
    public void helper(TreeNode root, int target, List<List<Integer>> ans, List<Integer> el){
        
        
        if(root == null) return;
 
        el.add(root.val);
        int temp = root.val;
        target -= temp;
        
        if(root.left == null && root.right == null && target == 0){
            ans.add(new ArrayList<>(el));
        }
        
        helper(root.left, target, ans, el);
        helper(root.right, target, ans, el);
        target += temp;
        el.remove(el.size()-1);    
        
    }
}