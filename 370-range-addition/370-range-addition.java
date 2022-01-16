class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int arr[] = new int[length];
        for(int[] tuple: updates) {
            int start = tuple[0];
            int end = tuple[1];
            int val = tuple[2];
            for(int i = start; i <= end; i++) {
                arr[i] += val;
            }
        }
        return arr;
    }
}