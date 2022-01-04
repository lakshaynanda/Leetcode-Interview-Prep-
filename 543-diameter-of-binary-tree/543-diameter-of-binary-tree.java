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
    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        helper(root);
        return diameter;
    }
    public int helper(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        int left = helper(node.left);
        int right = helper(node.right);
        
        diameter = Math.max(diameter, left + right);
        return Math.max(left, right) + 1;
    }
}