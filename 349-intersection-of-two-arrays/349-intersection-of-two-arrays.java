class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int i : nums1) {
            set1.add(i);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int i : nums2) {
            set2.add(i);
        }
        
        set1.retainAll(set2);
        
        int[] output = new int[set1.size()];
        int idx = 0;
        for(int i : set1) {
            output[idx++] = i;
        }
        return output;
    }
}