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
    HashMap<TreeNode, TreeNode> parentMap;
    List<Integer> ans;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        parentMap = new HashMap<>();
        ans = new ArrayList<>();
        HashSet<TreeNode> visited = new HashSet<>();
        createParentMap(root);
        dfs(target, visited, k);
        return ans;
    }
    public void createParentMap(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            parentMap.put(root.left, root);
        }
        if (root.right != null) {
            parentMap.put(root.right, root);
        }
        createParentMap(root.left);
        createParentMap(root.right);
    }
    public void dfs(TreeNode root, HashSet<TreeNode> visited, int k) {
        if (root == null) {
            return;
        }
        visited.add(root);
        if (k == 0) {
            ans.add(root.val);
            return;
        }
        if (parentMap.containsKey(root) && !visited.contains(parentMap.get(root))) {
            dfs(parentMap.get(root), visited, k - 1);
        }
        
        if (!visited.contains(root.left)) {
            dfs(root.left, visited, k - 1);
        }
        if (!visited.contains(root.right)) {
            dfs(root.right, visited, k - 1);
        }
    }
}