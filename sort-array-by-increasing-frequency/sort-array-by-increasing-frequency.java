class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int res[][] = new int[map.size()][2];
        int idx = 0;
        for(int i : map.keySet()) {
            res[idx][0] = i;
            res[idx][1] = map.get(i);
            idx++;
        }
        Arrays.sort(res, (a, b) -> a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]);
        int ans[] = new int[nums.length];
        
        int i = 0;
        int temp = 0;
        while(i < res.length) {
            for(int j = 0; j < res[i][1]; j++) {
                ans[temp++] = res[i][0];
            }
            i++;
        }
        return ans;
    }
}