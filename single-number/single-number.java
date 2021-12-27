class Solution {
    public int singleNumber(int[] nums) {
        //approach 1
        // Set<Integer> set = new HashSet<>();
        // int unique = 0;
        // int complete = 0;
        // for(int num : nums) {
        //     if (!set.contains(num)) {
        //         set.add(num);
        //         unique += num;
        //     }
        //     complete += num;
        // }
        // return 2 * unique - complete;
        
        
        //approach 2
        int a = 0;
        for(int num : nums) {
            a ^= num;
        }
        return a;
    }
}