/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        HashMap<Node, Node> visited = new HashMap<>();
        return dfs(node, visited);
    }
    
    public Node dfs(Node node, HashMap<Node, Node> visited){
        if(node == null) return null;
        
        Node graphNode = new Node(node.val);
        visited.put(node, graphNode);
        
        for(Node a: node.neighbors){
            
            Node curr = visited.containsKey(a)?visited.get(a):dfs(a, visited);
            graphNode.neighbors.add(curr);
            
        }
        return graphNode;
        
    }
}