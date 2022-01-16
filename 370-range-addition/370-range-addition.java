class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int arr[] = new int[length];
        for(int i = 0; i < updates.length; i++) {
            getResult(updates[i], arr);
        }
        return arr;
    }
    public int[] getResult(int[] updates, int[] arr) {
        for(int i = updates[0]; i <= updates[1]; i++) {
            arr[i] += updates[2];
        }
        return arr;
    }
}