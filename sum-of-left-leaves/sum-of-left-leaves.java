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
    int sum;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) {
            return 0;
        }
        sum = 0;
        helper(root);
        return sum;
    }
    public void helper(TreeNode root) {
        if (root.left != null && isLeaf(root.left)) {
            sum += root.left.val;
        }
        if(root.left != null) {
            helper(root.left);
        }
        if(root.right != null) {
            helper(root.right);
        }
    }
    public boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }
}