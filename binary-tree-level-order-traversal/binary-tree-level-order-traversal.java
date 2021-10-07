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
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        if (root == null) {
            return levels;
        }
        
        helper(root, levels, 0);
        return levels;
    }
    
    public void helper(TreeNode node, List<List<Integer>> levels,int level) {
        if (levels.size() == level) {
            levels.add(new ArrayList<Integer>());
        }
        
        levels.get(level).add(node.val);
        
        if(node.left != null) {
            helper(node.left, levels, level + 1);
        }
        if (node.right != null) {
            helper(node.right, levels, level + 1);
        }
    }
}