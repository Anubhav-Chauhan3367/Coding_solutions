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
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        ListNode ans = new ListNode();
        ListNode curr = ans;
        
        while(true){
            
            boolean anyLeft = false;
            for(int i=0; i<lists.length; i++){
                
                if(lists[i] != null){
                    anyLeft = true;
                    minHeap.add(lists[i].val);
                    lists[i] = lists[i].next;
                }   
            }
            
            if(!minHeap.isEmpty()){
                ListNode newNode = new ListNode(minHeap.poll());
                curr.next = newNode;
                curr = curr.next;    
            }
            if(!anyLeft){
                break;
            }
        }
        
        while(!minHeap.isEmpty()){
            ListNode newNode = new ListNode(minHeap.poll());
            curr.next = newNode;
            curr = curr.next;    
        }
        
        return ans.next;
        
    }
}