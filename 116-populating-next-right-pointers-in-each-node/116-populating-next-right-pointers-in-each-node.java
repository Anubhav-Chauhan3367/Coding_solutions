/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        if(root == null) return null;
        Node head = root;
        Queue<Node> q = new LinkedList<Node>();
        if(head.left != null) q.add(head.left);
        if(head.right != null) q.add(head.right);
        
        while(!q.isEmpty()){
            
            int qSize = q.size();
            Node curr = q.poll();
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
            
            for(int i=0; i<qSize-1; i++){
                Node temp = q.poll();
                curr.next = temp;
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
                curr = temp;
            }
            
            
        }
        
        return root;
    }
}