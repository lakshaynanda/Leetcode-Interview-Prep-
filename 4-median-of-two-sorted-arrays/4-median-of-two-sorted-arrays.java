// Runtime: 1 ms, faster than 100.00% of Java online submissions
// O(log(n+m))

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((a, b) -> a-b); 
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a, b) -> b-a);

        helper(nums1, minHeap, maxHeap);
        helper(nums2, minHeap, maxHeap);

        //if two heap's size are same, we return the median of two heap's top elements, else we simply return
        // minHeap's top element
        return minHeap.size() == maxHeap.size() ? (minHeap.poll() + maxHeap.poll())/2.0 : minHeap.poll()/1.0;

    }

    public void helper (int[] nums, PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap){

        // rule is minHeap's size can equal to or +1 greater than maxHeap's size
        for (int num:nums){
            //if minHeap is empty or the number is greater than minHeap's top element, add it to minHeap
            if (minHeap.isEmpty() || minHeap.peek() <= num)
            {
                minHeap.add(num);
            }else{
                //else if number is smaller than minHeap's top element, add to maxHeap
                maxHeap.add(num);
            }

            // evaluate sizes and move elements
            if (minHeap.size() - maxHeap.size() ==2){
                maxHeap.add(minHeap.poll());
            }else if (maxHeap.size() - minHeap.size() == 1){
                minHeap.add(maxHeap.poll());
            }
        }
    }
}