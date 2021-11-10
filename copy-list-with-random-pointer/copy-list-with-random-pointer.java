/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    HashMap<Node, Node> visitedHash = new HashMap<Node, Node>();
    public Node copyRandomList(Node head) {
        if(head == null) {
            return null;
        }
        
        if(this.visitedHash.containsKey(head)) {
            return this.visitedHash.get(head);
        }
        
        Node node = new Node(head.val, null, null);
        this.visitedHash.put(head, node);
        
        node.next = this.copyRandomList(head.next);
        node.random = this.copyRandomList(head.random);
        
        return node;
    }
}