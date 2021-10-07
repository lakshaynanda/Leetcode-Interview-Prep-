class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        List<Integer> curRow = null;
        List<Integer> prevRow = null;
        for(int i = 0; i < numRows; i++) {
            curRow = new ArrayList<Integer>();
            for(int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    curRow.add(1);
                } else {
                    curRow.add(prevRow.get(j-1) + prevRow.get(j));
                }
            }
            prevRow = curRow;
            result.add(curRow);
        }
        return result;
    }
}