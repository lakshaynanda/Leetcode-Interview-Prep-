class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length < 1) {
            return intervals;
        }
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        List<int[]> res = new ArrayList<>();
        int curr[] = intervals[0];
        res.add(curr);
        for(int val[]: intervals) {
            int curr_st = curr[0];
            int curr_end = curr[1];
            int next_st = val[0];
            int next_en = val[1];
            if(curr_end >= next_st) {
                curr[1] = Math.max(curr_end, next_en);
            } else {
                curr = val;
                res.add(curr);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}