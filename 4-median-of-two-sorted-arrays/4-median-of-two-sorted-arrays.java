// Runtime: 1 ms, faster than 100.00% of Java online submissions
// O(log(n+m))

class Solution {
    
    int length1 = 0;
    int length2 = 0;
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        length1 = nums1.length;
        length2 = nums2.length;
        
        int small = (length1 + length2 + 1) / 2;
        int large = (length1 + length2 + 2) / 2;
        // if odd, then they're the same number
        // if even, then they're the average of the middle 2
        
        return ((findMedian(nums1, 0, nums2, 0, small) + findMedian(nums1, 0, nums2, 0, large)) / 2.0);
    }
    
    public double findMedian(int[] nums1, int start1, int[] nums2, int start2, int end) {
    // num# is the current starting pointer of the array nums#
    // end is the current target index in the merged array
        
        if (start1 >= length1) {
            return nums2[start2 + end - 1];
        }
        if (start2 >= length2) {
            return nums1[start1 + end - 1];
        }
        // base case: if the start of either array exceeds,
        // just return whatever is left from the other array
        
        if (end == 1) {
            if (nums1[start1] < nums2[start2]) {
                return nums1[start1];
            } else {
                return nums2[start2];
            }
        }
        // base case: if the target is one, just return the smaller one
        
        int temp1;
        int temp2;
        
        if ((start1 + end / 2 - 1) >= nums1.length) {
            temp1 = 1000001;
        } else {
            temp1 = nums1[start1 + end / 2 - 1];
        }
        
        if ((start2 + end / 2 - 1) >= nums2.length) {
            temp2 = 1000001;
        } else {
            temp2 = nums2[start2 + end / 2 - 1];
        }
        
        if (temp1 < temp2) {
            return findMedian(nums1, start1 + end / 2, nums2, start2, end - end / 2);
        }
        else {
            return findMedian(nums1, start1, nums2, start2 + end / 2, end - end / 2);
        }
        
        // if one array does not contain the end/2 th element,
        // then it means the first end/2 elements in the other array cannot make it to the endth element in the total array.
        // example: [2,3,4] [3,4,5,6,7,8,9,10,11,12]
        // 13 elements in total, we need the 7th element in the merged array (end)
        // so even if all 3 elements in the first array get selected,
        // whatever they are,
        // the first 3 elements in the second array still won't get selected,
        // so we can simply get rid of them
        
        // if both arrays contain the end/2 th element,
        // then the one with smaller value, means that the first end/2 elements in that array,
        // won't get to the endth element in the merged array
        // example: [2,3,4,5,6] [1,4,5,6,7,8]
        // 11 elements in total, we need the 6th element in the merged array (end)
        // the 3rd element is smaller in array 1 than the 3rd element in array 2,
        // which means the first 3 elements in array 1 won't get selected,
        // so we can simply get rid of them
        
        // the value of end get deducted accordingly to the deduction of the elements we get rid of
        // so either start1 or starts2 gets added by end/2, and end gets subtracted by end/2
        
    }
}