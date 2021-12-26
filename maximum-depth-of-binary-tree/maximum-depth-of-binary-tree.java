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
    public int maxDepth(TreeNode root) {
        int ans = 0;
        ans = helper(root);
        return ans;
    }
    public int helper(TreeNode root) {
        int countL = 0;
        int countR = 0;
        if(root == null) {
            return 0;
        }
        countL += helper(root.left);
        countR += helper(root.right);
        
        return countL > countR ? countL + 1 : countR + 1;
    }
}