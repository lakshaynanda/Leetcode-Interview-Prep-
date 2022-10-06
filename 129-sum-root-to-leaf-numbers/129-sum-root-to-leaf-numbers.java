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
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        Stack<TreeNode> s = new Stack();
        Stack<Integer> nums = new Stack();
        
        int num = 0;
        
        while (root != null || !s.isEmpty()) {
            while(root != null) {
                s.push(root);
                num = num * 10 + root.val;
                nums.push(num);
                root = root.left;
            }
            root = s.pop();
            num = nums.pop();
            if (root.left == null && root.right == null) {
                sum = sum + num;
            }
            root = root.right;
        }
        return sum;
    }
}