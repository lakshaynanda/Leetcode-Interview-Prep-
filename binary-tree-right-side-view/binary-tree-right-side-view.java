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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> visibleValues = new ArrayList<>();
        if (root == null) {
            return visibleValues;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()) {
            int size = que.size();
            for(int i = 0; i < size; i++) {
                TreeNode current = que.remove();
                if(i == size - 1) {
                    visibleValues.add(current.val);
                }
                if (current.left != null) {
                    que.add(current.left);
                }
                if(current.right != null) {
                    que.add(current.right);
                }
            }
        }
        return visibleValues;
    }
}