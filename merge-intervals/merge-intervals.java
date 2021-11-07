class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length < 1) {
            return intervals;
        }
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        
        ArrayList<int[]> res = new ArrayList<>();
        int[] current = intervals[0];
        res.add(current);
        
        for(int[] val: intervals) {
            int curr_st = current[0];
            int curr_end = current[1];
            int next_st = val[0];
            int next_end = val[1];
            
            if (curr_end >= next_st) {
                current[1] = Math.max(curr_end, next_end);
            } else {
                current = val;
                res.add(current);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}