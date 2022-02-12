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
    List<Integer> list;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        parentMap = new HashMap<>();
        list = new ArrayList<>();
        createParentMap(root);
        HashSet<TreeNode> visited = new HashSet<>();
        dfs(visited, target, k);
        return list;
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
    
    public void dfs(HashSet<TreeNode> visited, TreeNode target, int k) {
        if (target == null) {
            return;
        }
        visited.add(target);
        
        if (k == 0) {
            list.add(target.val);
            return;
        }
        if (parentMap.containsKey(target) && !visited.contains(parentMap.get(target))) {
            dfs(visited, parentMap.get(target) , k - 1);
        }
        if (!visited.contains(target.left)) {
            dfs(visited, target.left , k - 1);
        }
        if (!visited.contains(target.right)) {
            dfs(visited, target.right , k - 1);
        }
        
    }
}