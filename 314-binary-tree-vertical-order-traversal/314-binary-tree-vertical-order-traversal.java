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
    List<List<Integer>> list = new ArrayList<>();
    HashMap<Integer, ArrayList<Integer>> columnMap = new HashMap<>();
    int min = 0;
    int max = 0;
    Queue<Pair<TreeNode, Integer>> queue = new ArrayDeque<>();
    public List<List<Integer>> verticalOrder(TreeNode root) {
        if (root == null) {
            return list;
        }
        queue.offer(new Pair(root, 0));
        while (queue.peek() != null) {
            bfs();
        }
        
        for(int i = min; i <= max; i++) {
            list.add(columnMap.get(i));
        }
        return list;
    }
    public void bfs() {
        Pair<TreeNode, Integer> p = queue.poll();
        TreeNode root = p.getKey();
        int column = p.getValue();
        if (root == null) {
            return;
        }
        if (columnMap.get(column) == null) {
            columnMap.put(column, new ArrayList<>());
        }
        
        columnMap.get(column).add(root.val);
        min = min > column ? column : min;
        max = max < column ? column : max;
        queue.offer(new Pair(root.left, column - 1));
        queue.offer(new Pair(root.right, column + 1));
    }
}