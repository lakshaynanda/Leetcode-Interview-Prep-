class Solution {
    public boolean verifyPreorder(int[] preorder) {
        if (preorder == null || preorder.length <= 1) {
            return true;
        }
        return helper(preorder, 0, preorder.length - 1);
    }
    public boolean helper(int[] preorder, int left, int right) {
        if (preorder == null || right - left < 1) {
            return true;
        }
        int root = preorder[left];
        int index = left + 1;
        
        while (index <= right && preorder[index] < root) {
            index++;
        }
        int temp = index;
        
        while(index <= right) {
            if (preorder[index] < root) {
                return false;
            }
            index++;
        }
        boolean l = helper(preorder, left + 1, temp - 1);
        boolean r = helper(preorder, temp, right);
        return l && r;
    } 
}