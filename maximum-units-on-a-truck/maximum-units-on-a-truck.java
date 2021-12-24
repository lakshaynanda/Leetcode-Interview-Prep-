class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (b1, b2) -> (b2[1] - b1[1]));
        int totBox = 0;
        for(int[] boxType : boxTypes) {
            int numBox = boxType[0];
            int minCount = Math.min(numBox, truckSize);
            totBox += minCount * boxType[1];
            truckSize -= minCount;
            
            if(truckSize == 0) {
                break;
            }
        }
        return totBox;
    }
}