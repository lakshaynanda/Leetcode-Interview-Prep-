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
class BSTIterator {
    ArrayList<Integer> res;
    int pointer;
    public BSTIterator(TreeNode root) {
        res = new ArrayList<>();
        pointer = 0;
        inOrder(root);
    }
    
    public int next() {
        return res.get(pointer++);
    }
    
    public void inOrder(TreeNode root) {
        if(root != null) {
            inOrder(root.left);
            res.add(root.val);
            inOrder(root.right);
        }
    }
    
    public boolean hasNext() {
        return pointer < res.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */