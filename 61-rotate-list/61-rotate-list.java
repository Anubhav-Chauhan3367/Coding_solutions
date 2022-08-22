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
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        
        int n = 0;
        ListNode first = head;
        while(first != null){
            n++;
            first = first.next;
        }
        
        if(n==0 || n==1) return head;
        
        k = k%n;
        if(k==0) return head;
        
        int r = n-k;
        ListNode curr = head;
        
        ListNode newHead;
        
        for(int i=0; i<r-1; i++){
            curr = curr.next; 
        }
        
        newHead = curr.next;
        curr.next = null;
        curr = newHead;
        
        for(int i=0; i<k-1; i++){
            curr = curr.next;
        }
        curr.next = head;
        
        return newHead;
        
        
    }
}