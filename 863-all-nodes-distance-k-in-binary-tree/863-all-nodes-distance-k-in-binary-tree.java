/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<TreeNode, TreeNode> parentmap;
    List<Integer> ans;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        parentmap = new HashMap<>();
        ans = new ArrayList<>();
        createParentMap(root);
        HashSet<TreeNode> visited = new HashSet<>();
        dfs(target, visited, k);
        return ans;
    }
    public void createParentMap(TreeNode root) {
        if (root == null) {
            return;
        }
        if(root.left != null) {
            parentmap.put(root.left, root);
        }
        if(root.right != null) {
            parentmap.put(root.right, root);
        }
        createParentMap(root.left);
        createParentMap(root.right);
    }
    public void dfs(TreeNode target, HashSet<TreeNode> visited, int k) {
        if (target == null) {
            return;
        }
        visited.add(target);
        if (k == 0) {
            ans.add(target.val);
            return;
        }
        if (parentmap.containsKey(target) && !visited.contains(parentmap.get(target))) {
            dfs(parentmap.get(target), visited, k - 1);
        }
        if (!visited.contains(target.left)) {
            dfs(target.left, visited, k - 1);
        }
        if (!visited.contains(target.right)) {
            dfs(target.right, visited, k - 1);
        }
    }
}