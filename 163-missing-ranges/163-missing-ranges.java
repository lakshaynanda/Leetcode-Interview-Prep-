class Solution {
    public void addRanges(int start, int end, List<String> ranges) {
        if (end == start) {
            ranges.add(Integer.toString(end));
            return;
        }
        ranges.add(Integer.toString(start) + "->" + Integer.toString(end));
    }
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> ranges = new LinkedList<>();
        if (nums.length == 0) {
            addRanges(lower, upper, ranges);
            return ranges;
        }
        int start = lower;
        for(int end : nums) {
            if (start < end) {
                addRanges(start, end - 1, ranges);
            }
            start = end + 1;
        }
        if (start <= upper) {
            addRanges(start, upper, ranges);
        }
        return ranges;
    }
}