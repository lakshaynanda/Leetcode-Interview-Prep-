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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }
        helper(root, 0, result);
        return result;
    }
    public void helper(TreeNode root, int level, List<List<Integer>> result) {
        if (level >= result.size()) {
            LinkedList<Integer> newlevel = new LinkedList<>();
            newlevel.add(root.val);
            result.add(newlevel);
        } else {
            if(level % 2 == 0) {
                result.get(level).add(root.val);
            } else {
                result.get(level).add(0, root.val);
            }
        }
        if (root.left != null) {
            helper(root.left, level + 1, result);
        }
        if (root.right != null) {
            helper(root.right, level + 1, result);
        }
    }
}