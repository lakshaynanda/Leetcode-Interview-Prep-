class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = num.length;
        int i = n - 1;
        
        while(i >= 0 || k > 0) {
            if(i >= 0) {
                ans.add((num[i] + k) % 10);
                k = (num[i] + k) / 10;
            } else {
                ans.add(k % 10);
                k = k / 10;
            }
            i--;
        }
        Collections.reverse(ans);
        return ans;
    }
}