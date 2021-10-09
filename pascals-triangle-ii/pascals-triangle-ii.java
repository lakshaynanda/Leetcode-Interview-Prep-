class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        List<Integer> current = null;
        List<Integer> prev = null;
        int count = 0;
        for(int i = 0; i <= rowIndex; i++) {
            current = new ArrayList<>();
            count++;
            for(int j = 0; j <= i; j ++) {
                if(j == 0 || i == j) {
                    current.add(1);
                } else {
                    current.add(prev.get(j-1) + prev.get(j));
                }
            }
            prev = current;
            result.add(current);
            if(count == rowIndex + 1) {
                ans = current;
            }
        }
        return ans;
    }
}