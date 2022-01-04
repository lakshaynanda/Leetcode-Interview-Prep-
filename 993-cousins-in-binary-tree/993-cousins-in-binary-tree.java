class Solution {
    Map<Integer, Integer> depths = new HashMap<>();
    Map<Integer, Integer> parents = new HashMap<>();
    
    public boolean isCousins(TreeNode root, int x, int y) {
        setDepthAndParent(root, x, y, 0, root.val);
        return (depths.get(x) == depths.get(y)) && (parents.get(x) != parents.get(y));
    }
    
    private void setDepthAndParent(TreeNode node, int x, int y, int depth, int parent){
        if (node == null)
            return;
        
		// No need to iterate rest of the tree if both are found
        if (depths.containsKey(x) && depths.containsKey(y))
            return;
        
		// Set depth and parent when found
        if (node.val == x){
            depths.put(x, depth);
            parents.put(x, parent);
        }
            
        if (node.val == y){
            depths.put(y, depth);   
            parents.put(y, parent);
        }
        
		// If not found, increase the depth and set the current node value as parent value
        setDepthAndParent(node.left, x, y, depth+1, node.val);
        setDepthAndParent(node.right, x, y, depth+1, node.val);
    }
}