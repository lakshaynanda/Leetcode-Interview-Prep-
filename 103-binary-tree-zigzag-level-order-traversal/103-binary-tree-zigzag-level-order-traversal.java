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
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> results = new ArrayList<>();
        DFS(root, 0, results);
        return results;
    }
    public void DFS(TreeNode root, int level, List<List<Integer>> results) {
        if (level >= results.size()) {
            LinkedList<Integer> newlevel = new LinkedList<>();
            newlevel.add(root.val);
            results.add(newlevel);
        } else {
            if (level % 2 == 0) {
                results.get(level).add(root.val);
            } else {
                results.get(level).add(0, root.val);
            }
        }
        
        if (root.left != null) {
            DFS(root.left, level + 1, results);
        }
        if (root.right != null) {
            DFS(root.right, level + 1, results);
        }
    }
}