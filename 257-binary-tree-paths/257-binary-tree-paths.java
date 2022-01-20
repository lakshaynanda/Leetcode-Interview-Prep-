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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        helper(root, "", res);
        return res;
    }
    public void helper(TreeNode root, String ans, List<String> res) {
        if (root != null) {
            ans += Integer.toString(root.val);
            if (root.left == null && root.right == null) {
                res.add(ans);
            } else {
                ans += "->";
                helper(root.left, ans, res);
                helper(root.right, ans, res);
            }
        }
    }
}