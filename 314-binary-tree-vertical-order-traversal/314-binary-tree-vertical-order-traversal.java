class Solution {
    HashMap<Integer, ArrayList<Pair<Integer, Integer>>> map;
    int maxCol;
    int minCol;
    
    public void dfs(TreeNode root, int row, int col) {
        if (root == null) {
            return;
        }
        maxCol = Math.max(maxCol, col);
        minCol = Math.min(minCol, col);
        if(!map.containsKey(col)) {
            map.put(col, new ArrayList<Pair<Integer, Integer>>());
        }
        map.get(col).add(new Pair<Integer, Integer>(row, root.val));
        if (root.left != null) {
            dfs(root.left, row + 1, col - 1);
        }
        if (root.right != null) {
            dfs(root.right, row + 1, col + 1);
        }
    }
    
    public List<List<Integer>> verticalOrder(TreeNode root) {
        map = new HashMap<>();
        maxCol = 0;
        minCol = 0;
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        dfs(root, 0, 0);
        
        for(int i = minCol; i <= maxCol; i++) {
            List<Integer> temp = new ArrayList<>();
            Collections.sort(map.get(i), (Pair<Integer, Integer> p1, Pair<Integer, Integer> p2) -> p1.getKey() - p2.getKey());
            for(Pair<Integer, Integer> p : map.get(i)) {
                temp.add(p.getValue());
            }
            result.add(temp);
        }
        return result;
    }
}