class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int result[] = new int[length];
        for(int[] update: updates) {
            result[update[0]] += update[2];
            if (update[1] + 1 < length) {
                result[update[1] + 1] -= update[2];
            }
        }
        
        for(int i = 1; i < length; i++) {
            result[i] += result[i - 1];
        }
        return result;
    }
}