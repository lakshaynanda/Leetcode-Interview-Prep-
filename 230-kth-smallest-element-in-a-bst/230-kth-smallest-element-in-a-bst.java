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
    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return list.size() > 0 ? list.get(list.size() - 1) : -1;
    }
    public void helper(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        helper(root.left, k);
        if (list.size() == k) {
            return;
        }
        list.add(root.val);
        helper(root.right, k);
    }
}