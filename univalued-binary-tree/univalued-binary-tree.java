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
    public boolean isUnivalTree(TreeNode root) {
        boolean val = false;
        val = helper(root);
        return val;
    }
    public static boolean helper(TreeNode root) {
        if(root == null) {
            return true;
        }
        boolean l = root.left == null || root.left.val == root. val ? helper(root.left) : false;
        boolean r = root.right == null || root.right.val == root. val ? helper(root.right) : false;
        
        return l && r;
    }
}