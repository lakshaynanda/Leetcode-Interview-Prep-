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
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        find(root, k, 0);
        return ans;
    }
    public int find(TreeNode root, int k, int count) {
        if (root == null) {
            return count;
        }
        int x = find(root.left, k, count);
        x++;
        if (x == k) {
            ans = root.val;
        }
        return find(root.right, k, x);
    }
}