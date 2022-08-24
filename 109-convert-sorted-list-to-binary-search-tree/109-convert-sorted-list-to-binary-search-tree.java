/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        
        if(head == null) return null;
        
        ListNode fast = head;
        ListNode preMid = null;
        ListNode slow = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            preMid = slow;
            slow = slow.next;
        }
        
        if(slow == fast) return new TreeNode(fast.val);
        
        TreeNode curr = new TreeNode(slow.val);
        preMid.next = null;
        
        curr.left = sortedListToBST(head);
        curr.right = sortedListToBST(slow.next);
        
        return curr;
    }
}