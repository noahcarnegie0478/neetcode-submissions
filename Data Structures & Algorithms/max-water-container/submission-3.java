class Solution {
    public int maxArea(int[] heights) {
        int leftPointer = 0; 
        int rightPointer = heights.length - 1;
        int maxValue = 0;
        while (leftPointer < rightPointer) {
            int value = Math.min(heights[leftPointer],heights[rightPointer]) * (rightPointer - leftPointer);
            maxValue = Math.max(value, maxValue);
            if (heights[leftPointer] > heights[rightPointer]) { 
                rightPointer--;
            }else{
                leftPointer++;
            }
        }
        return maxValue;
        
    }
}
