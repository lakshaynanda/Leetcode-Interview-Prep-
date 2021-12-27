class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        
        for(int num : nums2) {
            if(binaryS(nums1, num)) {
                set.add(num);
            }
        }
        
        int arr[] = new int[set.size()];
        int index = 0;
        for(int num : set) {
            arr[index] = num;
            index++;
        }
        return arr;
    }
    
    public boolean binaryS(int[] nums1, int num) {
        int left = 0;
        int right = nums1.length - 1;
        
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(num == nums1[mid]) {
                return true;
            } else if (num > nums1[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}