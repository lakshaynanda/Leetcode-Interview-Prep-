class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[] = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        
        while(left < right) {
            // int complement = target - nums[left];
            int mid = left + (right - left)/2;
            
            if(numbers[left] + numbers[right] < target) {
                left++;
            } else if(numbers[left] + numbers[right] > target) {
                right--;
            } else {
                arr[0] = left + 1;
                arr[1] = right + 1;
                return arr;
            }
        }
        arr[0] = -1;
        arr[1] = -1;
        return arr;
    }
}