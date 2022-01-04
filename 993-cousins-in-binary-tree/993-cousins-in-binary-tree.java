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
    Map<Integer, Integer> depths = new HashMap<>();
    Map<Integer, Integer> parents = new HashMap<>();
    public boolean isCousins(TreeNode root, int x, int y) {
        depthFinder(root, x, y, 0, root.val);
        return (depths.get(x) == depths.get(y)) && (parents.get(x) != parents.get(y));
    }
    private void depthFinder(TreeNode node, int x, int y, int depth, int parent) {
        if (node == null) {
            return;
        }
        if (depths.containsKey(x) && depths.containsKey(y)){
            return;
        }
        if (node.val == x) {
            depths.put(x, depth);
            parents.put(x, parent);
        }
            
        if (node.val == y){
            depths.put(y, depth);   
            parents.put(y, parent);
        }
        
        depthFinder(node.left, x, y, depth + 1, node.val);
        depthFinder(node.right, x, y, depth + 1, node.val);
    }
    
}

