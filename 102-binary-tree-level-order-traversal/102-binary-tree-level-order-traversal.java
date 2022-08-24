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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<Integer> level = new ArrayList<Integer>();
        q.add(root);
        q.add(null);
        while(q.size()>1){
            
            TreeNode curr = q.poll();
            if(curr == null){
                ans.add(new ArrayList<>(level));
                level.clear();
                q.add(null);
                continue; 
            }
            level.add(curr.val);
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
        if(!level.isEmpty()) ans.add(level);
        
        return ans;
    }
}