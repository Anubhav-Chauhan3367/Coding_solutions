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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = (l1.val+l2.val)/10;
        int newCarry = 0, currValue = 0;
        ListNode head = new ListNode((l1.val+l2.val)%10);
        ListNode curr = head;
        l1 = l1.next;
        l2 = l2.next;
        while(true){
            if(l1 == null && l2 == null && carry == 0) break;
            if(l1 != null){
                currValue += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                currValue += l2.val;
                l2 = l2.next;
            }
            newCarry = (currValue+carry)/10;
            currValue  = (currValue+carry)%10;
            curr.next = new ListNode(currValue);
            curr = curr.next;
            carry = newCarry;
            newCarry = 0;
            currValue = 0;
        }
        
        return head;
        
    }
}