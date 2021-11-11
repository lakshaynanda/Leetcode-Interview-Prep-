class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int n = digits.length;
        int i = n - 1;
        int k = 1;
        
        while(i >= 0 || k > 0) {
            if(i >= 0) {
                ans.add((digits[i] + k) % 10);
                k = (digits[i] + k) / 10;
            } else {
                ans.add(k % 10);
                k = k/10;
            }
            i--;
        }
        Collections.reverse(ans);
        int res[] = new int[ans.size()];
        for(int j = 0; j < ans.size(); j++) {
            res[j] = ans.get(j);
        }
        return res;
    }
}