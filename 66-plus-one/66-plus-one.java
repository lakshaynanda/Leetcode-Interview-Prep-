class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        int k = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                arr.add((digits[i] + k) % 10);
                k = (digits[i] + k) / 10;
            } else {
                arr.add(k % 10);
                k = k / 10;
            }
            i--;
        }
        int ans[] = new int[arr.size()];
        Collections.reverse(arr);
        for(int j = 0; j < arr.size(); j++) {
            ans[j] = arr.get(j);
        }
        return ans;
    }
}