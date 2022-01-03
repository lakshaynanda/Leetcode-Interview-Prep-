/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            return null;
        }
        TreeNode res = findLCA(root, p, q);
        if (res == p) {
            return findLCA(p, q, q) != null ? res : null;
        } else if (res == q) {
            return findLCA(q, p, p) != null ? res : null;
        }
        return res;
    }
    public TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = findLCA(root.left, p, q);
        TreeNode right = findLCA(root.right, p, q);
        
        if (left != null && right != null) {
            return root;
        }
        return left == null ? right : left;
    }
}