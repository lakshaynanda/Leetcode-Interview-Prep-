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
    public List<Integer> largestValues(TreeNode root)
    {
        List<Integer> l = new ArrayList<>();
        if(root == null)
            return l;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty())
        {
            int size = q.size();
            int max = Integer.MIN_VALUE;
            for(int i=0;i<size;i++)
            {
                TreeNode p = q.poll();
                if(p.left != null)
                    q.offer(p.left);
                if(p.right != null)
                    q.offer(p.right);
                max = Math.max(max,p.val);   //Storing the max of each row...
            }
            l.add(max);
        }
        
        return l;
        
    }
}