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
    private int count;
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return this.count - 1;
    }
    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftC = helper(root.left);
        int rightC = helper(root.right);
        this.count = Math.max(this.count, leftC + rightC + 1);
        return Math.max(leftC, rightC) + 1;
    }
}