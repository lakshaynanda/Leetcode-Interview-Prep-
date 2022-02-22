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
    List<Integer> list = new ArrayList<>();
    int k;
    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        helper(root);
        return list.size() > 0 ? list.get(list.size() - 1) : -1;
    }
    public void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.left);
        if (list.size() == k) {
            return;
        }
        list.add(root.val);
        helper(root.right);
    }
}