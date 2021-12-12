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
    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        HashSet<Integer> set = new HashSet<>();
        createSet(root1, target, set);
        return search(root2, set);
    }
    public void createSet(TreeNode root1, int target,HashSet<Integer> set) {
        if (root1 == null) {
            return;
        }
        set.add(target - root1.val);
        createSet(root1.left, target, set);
        createSet(root1.right, target, set);
    }
    public boolean search(TreeNode root2, HashSet<Integer> set) {
        if(root2 == null) {
            return false;
        }
        if(set.contains(root2.val)) {
            return true;
        }
        if(search(root2.left, set)) {
            return true;
        } else {
            return search(root2.right, set);
        }
    }
}